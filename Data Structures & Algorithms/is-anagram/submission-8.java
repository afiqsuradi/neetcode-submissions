class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        var sMap = new HashMap<Character, Integer>();
        var tMap = new HashMap<Character, Integer>();

        char sChar, tChar;
        for(int i = 0; i < s.length(); i++){
            sChar = s.charAt(i);
            sMap.put(sChar, sMap.containsKey(sChar) ? sMap.get(sChar) + 1 : 1);

            tChar = t.charAt(i);
            tMap.put(tChar, tMap.containsKey(tChar) ? tMap.get(tChar) + 1 : 1);
        }

        for(Map.Entry<Character, Integer> entry : sMap.entrySet()){
            if(tMap.containsKey(entry.getKey()) && tMap.get(entry.getKey()).equals(entry.getValue())) continue;
            return false;
        }

        return true;
    }
}

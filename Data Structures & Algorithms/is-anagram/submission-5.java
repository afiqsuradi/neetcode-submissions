class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        var letterTMap = new HashMap<Character, Integer>();
        var letterSMap = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
            letterSMap.put(s.charAt(i), letterSMap.containsKey(s.charAt(i)) ? letterSMap.get(s.charAt(i))+1 : 1);
            letterTMap.put(t.charAt(i), letterTMap.containsKey(t.charAt(i)) ? letterTMap.get(t.charAt(i))+1 : 1);
        }
        
        if(!letterTMap.equals(letterSMap)) return false;

        return true;
    }
}

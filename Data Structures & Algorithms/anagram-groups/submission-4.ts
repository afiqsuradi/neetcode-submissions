class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs: string[]): string[][] {
        const sortedStrMap = new Map<string, string>();
        const duplicateStr = new Map<string, number>();
        const anagramMap = new Map<string, string[]>
        for(const str of strs){
            sortedStrMap.set(str, str.split('').sort().join(''));
            duplicateStr.set(str, duplicateStr.get(str) ? (duplicateStr.get(str) + 1) : 1)
        }
        let dupeArr = []
        let dupe = 0
        for(const [key, value] of sortedStrMap){
            dupeArr = [];
            dupe = duplicateStr.get(key);
            if( dupe > 1){
                dupeArr = Array(dupe).fill(key)
            } else{
                dupeArr = [key]
            }
            if(anagramMap.has(value)){
                anagramMap.set(value, [...anagramMap.get(value), ...dupeArr])
            } else {
                anagramMap.set(value, dupeArr)
            }
        }
        return Array.from(anagramMap.values())
    }
}

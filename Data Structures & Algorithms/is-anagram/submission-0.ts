class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {
     const letterSMap = new Map<string, number>(); 
     const letterTMap = new Map<string, number>();
     for( const char of s){
        letterSMap.set(char, letterSMap.has(char) ? letterSMap.get(char) + 1 : 1);
     }
     for( const char of t){
        letterTMap.set(char, letterTMap.has(char) ? letterTMap.get(char) + 1 : 1);
     }
     if(letterSMap.size !== letterTMap.size) return false;
     for(const [key,value] of letterSMap){
        if((!letterTMap.has(key)) || letterTMap.get(key) !== value) return false;
     }
     return true;
    }
}

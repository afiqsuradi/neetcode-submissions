class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {
     if (s.length !== t.length) return false;
     const letterSMap = new Map<string, number>(); 
     const letterTMap = new Map<string, number>();
     for(let i = 0; i < s.length; i++){
        letterSMap.set(s[i], letterSMap.has(s[i]) ? letterSMap.get(s[i]) + 1: 1)
        letterTMap.set(t[i], letterTMap.has(t[i]) ? letterTMap.get(t[i]) + 1: 1)
     }
     if(letterSMap.size !== letterTMap.size) return false;
     for(const [key,value] of letterSMap){
        if((!letterTMap.has(key)) || letterTMap.get(key) !== value) return false;
     }
     return true;
    }
}

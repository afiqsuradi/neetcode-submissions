class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums: number[]): boolean {
        if(!(nums.length > 0)) return false;
        nums.sort((a, b)=> a - b);
        for(let i = 0; i < nums.length; i++){
            if(!((i + 1) < nums.length)) return false;
            if(nums[i] === nums[i + 1]) return true;
        }
    }
}

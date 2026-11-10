class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1) return new int[]{};
        var seenMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            seenMap.put(nums[i], i);
        }

        int diff = 0;
        for(int i = 0; i < nums.length - 1; i++){
            diff = target - nums[i];
            if(seenMap.containsKey(diff) && i != seenMap.get(diff)) return new int[]{i, seenMap.get(diff)};
        }
        return new int[]{};
    }
}

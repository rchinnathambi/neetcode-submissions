class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> valMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int diff = target - val;

            if(valMap.containsKey(diff)) {
                return new int[] {valMap.get(diff), i};
            } else {
                valMap.put(val, i);
            }
        }
        return new int[] {};
        /*for(int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int req = target - val;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == req) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
        */
    }
}

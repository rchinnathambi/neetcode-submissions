class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        int val = 0;
        for(int i = 0; i < nums.length; i++) {
            if(counter.get(nums[i]) == null) {
                counter.put(nums[i], 1);
            } else {
                val = nums[i];
            }
        }
        return val;
    }
}

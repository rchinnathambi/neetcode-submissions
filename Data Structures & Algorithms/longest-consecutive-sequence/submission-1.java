class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2) return nums.length;
        Arrays.sort(nums);
        int count = 1;
        int longestSequence = 1;
        int val = nums[0];
        int prevVal = val;
        for(int i = 1; i < nums.length; i++) {
            
            if(nums[i] == prevVal) continue;
            System.out.println("i:" + i + " - nums[i]:" + nums[i] + " - val:" + val + " - prevVal:" + prevVal);
            prevVal = nums[i];
            if(nums[i] == val + 1){
                count++;
                val = nums[i];
            } else {
                longestSequence = Math.max(longestSequence, count);
                count = 1;
                val = nums[i];
            }
        }
        return Math.max(longestSequence, count);
    }
}

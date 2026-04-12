class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] val = new int[2];
        if(nums.length < 2){
            return null;
        }
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    val[0] = i;
                    val[1] = j;
                    break;
                }
            }
            if(val[0] != val[1]){
                break;
            }
        }
        return val;
    }
}

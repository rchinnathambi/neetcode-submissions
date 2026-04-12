class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> resultSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(list);
                        resultSet.add(list);
                    }
                }
            }
        }
        /*
        for(int i = 0, j = nums.length - 1; i < j; i++) {
            int val = - (nums[i] + nums[j]);
            System.out.println("value: " + val);
            for(int k = i + 1; k < j; k++) {
                if(nums[k] == val) {
                    result.add(Arrays.asList(i, j, k));
                }
            }
        }*/
        result.addAll(resultSet);
        return result;
    }
}

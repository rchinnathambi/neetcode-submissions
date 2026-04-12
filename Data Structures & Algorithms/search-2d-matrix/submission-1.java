class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
		int lr = 0, rr = matrix.length - 1;
		int columns = matrix[0].length - 1;
		while(lr <= rr) {
			int mr = lr + ((rr - lr) / 2);
			if(matrix[mr][0] < target) {
				if(matrix[mr][columns] >= target) {
					return binarySearch(matrix[mr], target);
				} else {
					lr = mr + 1;
				}
			} else if (matrix[mr][0] > target) {
				rr = mr - 1;
			} else {
				return binarySearch(matrix[mr], target);
			}
		}
        return false;
    }
	
	public static boolean binarySearch(int[] nums, int target) {
		int l = 0, r = nums.length - 1;
        while(l <= r) {
            int m = l + ((r - l) / 2);
            if(nums[m] > target) {
                r = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                return true;
            }
        }
        return false;
	}
}

class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        for(int i = 0; i < heights.length; i++) {
            for(int j = i+1; j < heights.length; j++) {
                int height = Math.min(heights[i], heights[j]);
                int distance = j - i;
                int newArea = height * distance;
                result = Math.max(result, newArea);
            }
        }
        return result;
    }
}

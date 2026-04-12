class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        /*
        for(int i = 0, j = heights.length; i < j; i++) {
            int hi = heights[i];
            int hj = heights[j];
            if(hi <= hj) {
                localResult = hi * hi;
            } 
            if(hj <= hi) {
                localResult = hj * hj;
            }
            if(localResult > result) {
                result = localResult;
            }
        }
        */
        for(int i = 0; i < heights.length; i++) {
            for(int j = i+1; j < heights.length; j++) {
                int localResult = 0;
                int hi = heights[i];
                int hj = heights[j];
                int distance = j - i;
                if(hi <= hj) {
                    localResult = hi * distance;
                } 
                if(hj <= hi) {
                    localResult = hj * distance;
                }
                if(localResult > result) {
                    result = localResult;
                }
            }
        }
        return result;
    }
}

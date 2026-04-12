class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }
        int l = 0, r = height.length - 1;
        int hl = height[l];
        int hr = height[r];
        int area = 0;
        while(l < r) {
            if(hl < hr) {
                l++;
                hl = Math.max(hl, height[l]);
                area += hl - height[l];
            } else {
                r--;
                hr = Math.max(hr, height[r]);
                area += hr - height[r];
            }
        }
        return area;
        /*
        if min left & right - height is positive
        */
        /*
        if(height.length < 3) return 0;
        int l = 0, r = height.length - 1;
        int wa = 0;
        int ba = 0;
        while(l < r) {
            wa = Math.min(height[l], height[r]) * (l - r);

        }
        */
        /*
        int area = 0;
        boolean flag = false; //increasing
        int wh = 0;
        for(int i = 0; i < height.length - 1; i++) {
            flag = height[i+1] - Math.max(height[i], wh) >= 0;
            if(flag){
                continue;
            } else {
                wh = height[i] - height[i+1]
                area += height[i] - height[i+1];
            }
        }
        */
    }
}

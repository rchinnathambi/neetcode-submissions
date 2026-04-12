class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++) {
            pq.offer(-nums[i]);
        }

        int result = 0;
        while(k > 0) {
            result = pq.poll();
            k--;
        }
        return -result;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        for(int[] point: points) {
            int dist = (int) (Math.pow(point[0], 2) + Math.pow(point[1], 2));
            pq.offer(new int[]{dist, point[0], point[1]});
        }

        int[][] result = new int[k][2];
        for(int i = 0; i < k; i++) {
            int[] q = pq.poll();
            result[i] = new int[]{q[1], q[2]};
        }
        return result;
    }
}

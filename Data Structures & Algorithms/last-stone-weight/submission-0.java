class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> sq = new PriorityQueue<>();
        for(int i = 0; i < stones.length; i++) {
            sq.offer(-stones[i]);
        }

        while(sq.size() > 1) {
            int s1 = sq.poll();
            int s2 = sq.poll();
            sq.offer(-(Math.abs(s1-s2)));
        }

        if(sq.size() == 1) {
            return -sq.poll();
        } else {
            return 0;
        }
 
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Store how many times each element repeated in a map
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        //Store each element in map as Integer array then apply sorting based on entry count
        List<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            list.add(new int[] {entry.getValue(), entry.getKey()});
        }
        list.sort((a, b) -> a[0] - b[0]);

        //Because items are sorted in ascending order, pick K elements from the end of List
        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            int[] val = list.removeLast();
            result[i] = val[1];
        }
        return result;
    }
}

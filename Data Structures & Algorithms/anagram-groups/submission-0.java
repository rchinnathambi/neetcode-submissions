class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Hashmap to hash a key after sort and insert in val as linkedlist
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(map.containsKey(key)) {
                List<String> list = map.get(key);
                list.add(s);
                map.put(key, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            }
        }

        List<List<String>> llist = new ArrayList<>(map.values());
        return llist;
    }
}

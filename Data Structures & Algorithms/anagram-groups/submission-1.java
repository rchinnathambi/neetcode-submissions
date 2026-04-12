class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> listOfAnagramList = new ArrayList<>();
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] cArray = s.toCharArray();
            Arrays.sort(cArray);
            String mapKey = String.valueOf(cArray);
            if(anagramMap.get(mapKey) == null) {
                List<String> anagramList = new ArrayList<>();
                anagramList.add(s);
                anagramMap.put(mapKey, anagramList);
            } else {
                List<String> anagramList = anagramMap.get(mapKey);
                anagramList.add(s);
                anagramMap.put(mapKey, anagramList);
            }
        }
        for(Map.Entry<String, List<String>> entry: anagramMap.entrySet()) {
            listOfAnagramList.add(entry.getValue());
        }
        return listOfAnagramList;
    }
}

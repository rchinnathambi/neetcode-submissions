class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() || s.length() == 0) {
			return false;
		}
		char[] sa = s.toCharArray();
		List<Character> sList = new ArrayList<>();
		for(char c: sa) {
			sList.add(c);
		}
        for(int i = 0; i < t.length(); i++){
            sList.remove(new Character(t.charAt(i)));
        }
        return (sList.size() == 0) ? true : false;
    }
}

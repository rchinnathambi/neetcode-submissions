class Solution {
    public boolean hasDuplicate(int[] nums) {
        List l = new ArrayList();
		for(int i = 0; i<nums.length ; i++) {
			l.add(nums[i]);
		}
        Set s = new HashSet();
        s.addAll(l);
        System.out.println(l.size() + ":" + s.size());
        if(l.size() != s.size()) {
             return true;
        } else {
            return false;
        }
    }
}

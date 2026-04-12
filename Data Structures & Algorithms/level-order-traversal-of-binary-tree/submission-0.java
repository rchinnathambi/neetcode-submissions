/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int level = 0;
        if(root != null) {
            q.add(root);
        }
        while(!q.isEmpty()) {
            level++;
            List<Integer> levelValList = new ArrayList<>();
            for(int i = q.size(); i > 0; i--) {
                TreeNode node = q.poll();
                if(node != null) {
                    levelValList.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(!levelValList.isEmpty()) {
                result.add(levelValList);
            }
        }
        return result;
        /*
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            for(int i = q.size(); i > 0; i--) {
                TreeNode node = q.poll();
                if(node != null) {
                    level.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(level.size() > 0) {
                res.add(level);
            }
        }
        return res;
        */
    }
}

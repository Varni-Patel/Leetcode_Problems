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
        List<List<Integer>> answer = new ArrayList<>();
        calculate(answer, root, 0);
        return answer;
    }

    public void calculate(List<List<Integer>> answer, TreeNode current, int level){
        if(current == null)    return;

        if(answer.size() == level)  answer.add(new ArrayList<>());

        answer.get(level).add(current.val);

        calculate(answer, current.left, level + 1);
        calculate(answer, current.right, level + 1);
    }
}
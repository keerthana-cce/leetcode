class Solution {
    List<Integer> res = new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        tree(root);
        return res;
    }
    public void tree(TreeNode root){
        if(root==null) return;
        res.add(root.val);
        tree(root.left);
        tree(root.right);
    }
}

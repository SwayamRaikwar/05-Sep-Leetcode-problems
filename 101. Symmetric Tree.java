class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // Both nodes are null -> symmetric at this branch
        if (t1 == null && t2 == null) return true;
        
        // One node is null while the other is not -> asymmetric
        if (t1 == null || t2 == null) return false;
        
        // Values must match and mirror subtrees must match
        return (t1.val == t2.val) 
            && isMirror(t1.left, t2.right) 
            && isMirror(t1.right, t2.left);
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        // Base case: an empty tree/node has a depth of 0
        if (root == null) {
            return 0;
        }
        
        // Recursively calculate the depth of left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        // The depth of the current node is 1 + the maximum of its subtrees
        return 1 + Math.max(leftDepth, rightDepth);
    }
}

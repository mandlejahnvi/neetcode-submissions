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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder,
                           int preIndex, int inLeft, int inRight) {

        if (inLeft > inRight)
            return null;

        // First element in preorder is the root
        TreeNode root = new TreeNode(preorder[preIndex]);

        // Find root in inorder
        int index = inLeft;

        while (inorder[index] != root.val)
            index++;

        // Number of nodes in left subtree
        int leftSize = index - inLeft;

        root.left = build(
            preorder,
            inorder,
            preIndex + 1,
            inLeft,
            index - 1
        );

        root.right = build(
            preorder,
            inorder,
            preIndex + leftSize + 1,
            index + 1,
            inRight
        );

        return root;
    }
}

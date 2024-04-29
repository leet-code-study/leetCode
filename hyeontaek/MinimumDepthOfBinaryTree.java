package hyeontaek;

public class MinimumDepthOfBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
        public String toString() {
            return String.format("{%s, %s, %s}", val, left, right);
        }
    }
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public int minDepth2(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth2(root.left);
        int right = minDepth2(root.right);
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }
    public static void main(String[] args) {
        MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode root2 = new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null ,new TreeNode(5, null,new TreeNode(6)))));
        System.out.println(solution.minDepth(root));
        System.out.println(solution.minDepth(root2));
        System.out.println(solution.minDepth2(root));
        System.out.println(solution.minDepth2(root2));
        System.out.println(root);
        System.out.println(root2);
    }

}

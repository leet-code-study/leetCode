package hyeontaek;

public class MaximumDepthOfBinaryTree {

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

    public String toString() {
      return String.format("{%s, %s, %s}", val, left, right);
    }
  }
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }
  public static void main(String[] args) {
    TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
    System.out.println(solution.maxDepth(root));
    System.out.println(root);
  }
}

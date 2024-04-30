package hyeontaek;

public class PathSum {


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

  public boolean hasPathSum(TreeNode root, int targetSum) {

    if(root == null) return false;
    if(root.left == null && root.right == null) return targetSum == root.val;
    return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
    PathSum solution = new PathSum();
    System.out.println(solution.hasPathSum(root, 22));
    System.out.println(root);
  }

}

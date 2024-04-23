package hyeontaek;

public class SameTree {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

  public static void main(String[] args) {
    SameTree solution = new SameTree();
    TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    System.out.println(p);
    System.out.println(solution.isSameTree(p, q));
  }

}

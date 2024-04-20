package hyeontaek;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

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
      return String.format("\nval: %s\n <-: %s ->: %s", val, left, right);
    }
  }


    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> result = new ArrayList<>();

      if (root == null) {
        return result;
      }
      result.addAll(inorderTraversal(root.left));
      result.add(root.val);
      result.addAll(inorderTraversal(root.right));


      return result;
    }

  public static void main(String[] args) {
    BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();
    TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
    System.out.println(solution.inorderTraversal(root));
    System.out.println(root);
  }

}

package hyeontaek;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(5);
    System.out.println(new BinaryTreePaths().binaryTreePaths(root));
  }

  public List<String> binaryTreePaths(TreeNode root) {
    List<String> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    if (root.left == null && root.right == null) {
      result.add(String.valueOf(root.val));
      return result;
    }

    List<String> left = binaryTreePaths(root.left);
    List<String> right = binaryTreePaths(root.right);

    for (String s : left) {
      result.add(root.val + "->" + s);
    }

    for (String s : right) {
      result.add(root.val + "->" + s);
    }

    return result;
  }

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

}

package hyeontaek;

public class ConvertSortedArrayToBinarySearchTree {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return sort(nums, 0, nums.length - 1);
    }
    public TreeNode sort(int[] nums, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sort(nums, start, mid - 1);
        node.right = sort(nums, mid + 1, end);
        return node;
    }

  public static void main(String[] args) {
    int[] nums = {-10,-3,0,5,9};
    ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();
    TreeNode root = solution.sortedArrayToBST(nums);
    System.out.println(root);
  }

}

public class CountBinaryTree {
    TreeNode root;

    // hàm đếm số nút lá
    public int countLeaves(TreeNode node) {
        if (node == null) return 0; // không có nút
        if (node.left == null && node.right == null) return 1; // là nút lá
        // đệ quy để đếm nút lá trong cây con trái và cây con phải
        return countLeaves(node.left) + countLeaves(node.right);
    }
}

class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class TNode {
    private int data;
    private TNode left, right;

    public TNode(int data) {
        this.data = data;
        left = right = null;
    }

    public TNode(int data, TNode left, TNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TNode getLeft() {
        return left;
    }

    public void setLeft(TNode left) {
        this.left = left;
    }

    public TNode getRight() {
        return right;
    }

    public void setRight(TNode right) {
        this.right = right;
    }
}

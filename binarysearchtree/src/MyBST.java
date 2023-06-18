import java.util.Scanner;

public class MyBST {
    private TNode root;

    private boolean timBST(int x, TNode T) {
        if (T == null) {
            return false;
        } else if (T.getData() == x) {
            return true;
        } else if (x < T.getData()) {
            return timBST(x, T.getLeft());
        } else {
            return timBST(x, T.getRight());
        }
    }

    private void duyettrungtu(TNode T) {
        if (T != null) {
            duyettrungtu(T.getLeft());
            System.out.print("-> " + T.getData());
            duyettrungtu(T.getRight());
        }
    }

    public void duyettrungtu() {
        duyettrungtu(root);
    }

    private TNode insert(int x, TNode T) {
        if (T == null) {
            T = new TNode(x);
        } else if (x == T.getData()) {
            System.out.println("Da co " + x + " trong cay\n");
        } else if (x < T.getData()) {
            T.setLeft(insert(x, T.getLeft()));
        } else {
            T.setRight(insert(x, T.getRight()));
        }
        return T;
    }

    public void insert(int x) {
        root = insert(x, root);
    }

    private void taocay() {
        root = null;
        Scanner sc = new Scanner(System.in);
        int x;
        while (true) {
            System.out.println("Nhap x khac - de them vao cay: ");
            x = Integer.parseInt(sc.next());
            if (x == 0) {
                break;
            } else {
                insert(x);
            }
        }
    }

    public int max(TNode T) {
        if (T == null) {
            return 0;
        } else {
            TNode p = T;
            while (p.getRight() != null) {
                p = p.getRight();
            }
            return p.getData();
        }
    }
}

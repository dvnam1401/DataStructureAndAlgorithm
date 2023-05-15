public class MyBinaryTree {
    private TNode root;

    public void taocayT() {
        TNode A = new TNode(7, new TNode(2), new TNode(6));
        TNode B = new TNode(5, null, new TNode(9));
        root = new TNode(2, A, B);
    }

    public void duyet1(TNode T) {
        if (T != null) {
            System.out.print("->" + T.getData());
            duyet1(T.getLeft());
            duyet1(T.getRight());
        }
    }

    public void duyet2(TNode T) {
        if (T != null) {
            duyet2(T.getLeft());
            System.out.print("->" + T.getData());
            duyet2(T.getRight());
        }
    }

    public void duyet3(TNode T) {
        if (T != null) {
            duyet3(T.getLeft());
            duyet3(T.getRight());
            System.out.print("->" + T.getData());
        }
    }

    public void duyettientu() {
        duyet1(root);
    }

    public void duyettrungtu() {
        duyet2(root);
    }

    public void duyethautu() {
        duyet3(root);
    }

    public void taocayT1() {
        TNode root1 = new TNode(7, new TNode(5), new TNode(1, null, new TNode(9)));
        TNode root2 = new TNode(2, new TNode(6, null, new TNode(4)), new TNode(3));
        root = new TNode(8, root1, root2);
    }

    public int sonot(TNode T) {
        if (T == null) {
            return 0;
        } else {
            return 1 + sonot(T.getLeft()) + sonot(T.getRight());
        }
    }

    public int sonot() {
        return sonot(root);
    }

    public int tongnot(TNode T) {
        if (T == null) {
            return 0;
        } else {
            return T.getData() + tongnot(T.getLeft()) + tongnot(T.getRight());
        }
    }

    public int tongnot() {
        return tongnot(root);
    }

    public int sola(TNode T) {
        if (T == null) {
            return 0;
        } else {
            if (T.getLeft() == null && T.getRight() == null) {
                return 1;
            } else {
                return sonot(T.getLeft()) + sonot(T.getRight());
            }
        }
    }

    public int sola() {
        return sola(root);
    }

    public int tongnottrong(TNode T) {
        if (T == null || T.getLeft() == null && T.getRight() == null) {
            return 0;
        } else {
            return T.getData() + tongnottrong(T.getLeft()) + tongnottrong(T.getRight());
        }
    }

    public int tongsonottrong() {
        return tongnottrong(root);
    }

    public int tongsonotle(TNode T) {
        if (T == null) {
            return 0;
        } else {
            if (T.getData() % 2 == 1) {
                return T.getData() + tongsonotle(T.getLeft()) + tongsonotle(T.getRight());
            } else {
                return tongsonotle(T.getLeft()) + tongsonotle(T.getRight());
            }
        }
    }

    public int tongsonotle() {
        return tongsonotle(root);
    }

    public int sonnotmotcon(TNode T) {
        if (T == null || T.getLeft() == null && T.getRight() == null) {
            return 0;
        } else {
            if ()
        }
    }
//    Tính chiều cao của cây
//    Kiểm tra cây có cân bằng hay không
//    Tìm trong cây có giá trị x không
//    Tìm giá trị lớn nhất trong cây
//    Mức của 1 nốt
//    In tất cả các nôt ở mức thứ k
//    Tìm mức có nhiều nôt nhất
//    Cho biết mức có tổng các nốt lớn nhất.


    public static void main(String[] args) {
        MyBinaryTree mbt = new MyBinaryTree();
        mbt.taocayT1();
        System.out.print("Duyet tien tu: ");
        mbt.duyettientu();
        System.out.print("\nDuyet trung tu: ");
        mbt.duyettrungtu();
        System.out.print("\nDuyet hau tu: ");
        mbt.duyethautu();
        System.out.println("\nSo not tren cay: " + mbt.sonot());
        System.out.println("Tong not tren cay: " + mbt.tongnot());
        System.out.println("So not la: " + mbt.sola());
        System.out.println("Tong cac not trong: " + mbt.tongsonottrong());
        System.out.println("Tong so not le trong: " + mbt.tongsonotle());
    }
}

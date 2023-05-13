import java.util.Scanner;

public class MyStack {
    private Node top;
    private int TEMPNUMBER = 0;

    public MyStack() {
        top = null;
    }

    private void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap mot so khac 0 de them vao NX: ");
            TEMPNUMBER = Integer.parseInt(sc.next());
            if (TEMPNUMBER == 0) {
                break;
            }
            push(TEMPNUMBER);
        }
        System.out.println("Da them thanh cong");
    }

    private void backup(MyStack myStack) {
        while (!myStack.emptyS()) {
            push(myStack.pop());
        }
    }

    private int size() {
        MyStack temp = new MyStack();
        int count = 0;
        while (!emptyS()) {
            count++;
            TEMPNUMBER = pop();
            temp.push(TEMPNUMBER);
        }
        backup(temp);
        return count;
    }

    private void output() {
        MyStack temp = new MyStack();
        System.out.println("\nNoi dung ngan xep");
        while (!emptyS()) {
            TEMPNUMBER = pop();
            System.out.print(TEMPNUMBER + " ");
            temp.push(TEMPNUMBER);
        }
        backup(temp);
    }

    private int pop() {
        if (top == null) {
            return 0;
        } else {
            TEMPNUMBER = top.getData();
            top = top.getNext();
        }
        return TEMPNUMBER;
    }

    boolean emptyS() {
        return top == null;
    }

    void push(int number) {
        top = new Node(number, top);
    }

    void creatS() {
        top = null;
    }

    private int sum() {
        int sumStack = 0;
        MyStack temp = new MyStack();
        while (!emptyS()) {
            TEMPNUMBER = pop();
            sumStack += TEMPNUMBER;
            temp.push(TEMPNUMBER);
        }
        backup(temp);
        return sumStack;
    }

    private int countOdd() {
        int count = 0;
        MyStack temp = new MyStack();
        while (!emptyS()) {
            TEMPNUMBER = pop();
            if (TEMPNUMBER % 2 == 1) {
                count++;
            }
            temp.push(TEMPNUMBER);
        }
        backup(temp);
        return count;
    }

    private int maxNumber() {
        int max = top.getData();
        MyStack temp = new MyStack();
        while (!emptyS()) {
            TEMPNUMBER = pop();
            if (TEMPNUMBER > max) {
                max = TEMPNUMBER;
            }
            temp.push(TEMPNUMBER);
        }
        backup(temp);
        return max;
    }

    private void deleteLastElement() {
        MyStack temp = new MyStack();
        Node p = top;
        while (!emptyS()) {
            if (p.getNext() == null) {
                pop();
                System.out.println("\nDelete successful");
                break;
            } else {
                p = p.getNext();
                TEMPNUMBER = pop();
                temp.push(TEMPNUMBER);
            }

        }
        backup(temp);
        if (emptyS()) {
            System.out.println("Error");
        }
    }

    private void insertWithIndex(int value, int index) {
        MyStack temp = new MyStack();
        int tempIndex;
        if ((tempIndex = size()) > index) {
            while (!emptyS()) {
                if (tempIndex == index) {
                    top = new Node(value, top);
                    break;
                }
                TEMPNUMBER = pop();
                temp.push(TEMPNUMBER);
                tempIndex--;
            }
        } else {
            System.out.println("\nIndexes do not exist");
        }
        backup(temp);
    }

    private void insertLastIndex(int value) {
        MyStack temp = new MyStack();
        int tempIndex = size(), index = 1;
        if (tempIndex != 0) {
            while (!emptyS()) {
                if (tempIndex == index) {
                    temp.push(pop());
                    push(value);
                    break;
                }
                TEMPNUMBER = pop();
                temp.push(TEMPNUMBER);
                index++;
            }
        } else {
            System.out.println("Khong co vi tri cuoi cung");
        }
        backup(temp);
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.input();
        myStack.output();
        System.out.println("\nSum stack: " + myStack.sum());
        System.out.println("\nCount odd of stack: " + myStack.countOdd());
        System.out.println("\nMax number is: " + myStack.maxNumber());
        myStack.deleteLastElement();
        myStack.insertWithIndex(100, 4);
        myStack.insertLastIndex(9);
        myStack.output();
    }
}

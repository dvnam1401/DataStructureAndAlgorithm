public class JosePhus {
    static void JosePhus(int n, int k) {
        MyQueue Q = new MyQueue();
        for (int i = 1; i <= n; i++) {
            Q.addQ(i);
        }
        int d = 0, vt = 1;
        while (d < n - 1) {
            int x = Q.removeQ();
            if (vt < k) {
                vt++;
                Q.addQ(x);
            } else {
                d++;
                vt = 1;
            }
        }
        System.out.println("Vua la: " + Q.removeQ());
    }

    public static void main(String[] args) {
        JosePhus(13, 3);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loop;

import java.math.BigInteger;

/**
 *
 * @author vanna
 */
public class My_FIB {

    static BigInteger fib3(int n) {
        BigInteger f0, f1, f2;
        f0 = BigInteger.ONE;
        f1 = BigInteger.ONE;
        for (int i = 0; i <= n; i++) {
            f2 = f1.add(f0);
            f0 = f1;
            f1 = f2;
        }
        return f1;
    }

    static long fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    static long fib1(int n) {
        long[] f;
        f = new long[n + 1];
        f[0] = f[1] = 1;
        for (int i = 0; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    static long fib2(int n) {
        long f0 = 1, f1 = 1, f2;
        for (int i = 0; i <= n; i++) {
            f2 = f1 + f0;
            f0 = f1;
            f1 = f2;
        }
        return f1;
    }

    public static void main(String[] args) {
        int n = 180;

    }
}

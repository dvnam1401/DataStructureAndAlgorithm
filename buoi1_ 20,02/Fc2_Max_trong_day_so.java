/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fc2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class Fc2_Max_trong_day_so {

    public static void method() {
        Scanner kb = new Scanner(System.in);
        int a[];
        int n, max = 0;
        System.out.println("\nNhap so phan tu cua mang:");
        n = kb.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap so thu " + (i + 1) + ": ");
            a[i] = kb.nextInt();
        }
        max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("So lon nhat la: " + max);
    }

    public static void method1() {
        Scanner kb = new Scanner(System.in);

        int n, x, max = 0;
        System.out.println("\nNhap so phan tu cua mang:");
        n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap so thu " + (i + 1) + ": ");
            x = kb.nextInt();
            if (i == 0) {
                max = x;
            } else if (max <= x) {
                max = x;
            }
        }
        System.out.println("So lon nhat la: " + max);
    }

    public static void main(String[] args) {
        method();
    }
}

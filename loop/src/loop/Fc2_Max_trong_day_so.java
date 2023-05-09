/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loop;

import java.util.Scanner;

/**
 *
 * @author vanna
 */
public class Fc2_Max_trong_day_so {

    static void method() {
        Scanner sc = new Scanner(System.in);
        int a[];
        int n, max = 0;
        System.out.print("\n Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap so thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            System.out.println("So lon nhat la: " + max);
        }
    }

    static void method1() {
        Scanner sc = new Scanner(System.in);
        int n, x, max = 0;
        System.out.println("\nNhap so phan tu cua mang: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap so thu: " + (i + 1) + ": ");
            x = sc.nextInt();
            if (i == 0) {
                max = x;
            } else if (max <= x) {
                max = x;
            }
        }
        System.out.println("So lon thu nhat la: " + max);
    }
    
    public static void main(String[] args) {
        method();
    }
}

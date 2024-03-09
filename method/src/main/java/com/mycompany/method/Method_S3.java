/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.method;


import java.util.Scanner;

public class Method_S3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (antara 1 sampai 1000): ");
        int N = scanner.nextInt();

        printPattern(N);

        scanner.close();
    }

    public static void printPattern(int N) {
        System.out.println("Pola bintang untuk N = " + N + ":");
        for (int i = 1; i <= N; i++) {
            printStars(i);
            System.out.println(); // Membuat baris baru setelah setiap baris pola tercetak
        }
    }

    public static void printStars(int numStars) {
        for (int i = 1; i <= numStars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Membuat baris baru setelah setiap baris bintang tercetak
        }
    }
}


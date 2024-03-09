/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.method;



import java.util.Scanner;

public class Method_S1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            inputAndCheckNumbers(scanner);
            System.out.println("Apakah Anda ingin memasukkan tiga bilangan bulat lagi? (ya/tidak)");
            String input = scanner.next();
            continueInput = input.equalsIgnoreCase("ya");
        }

        scanner.close();
    }

    public static void inputAndCheckNumbers(Scanner scanner) {
        System.out.println("Masukkan tiga bilangan bulat:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean isRibuan = checkIfThousand(num1) && checkIfThousand(num2) && checkIfThousand(num3);

        if (isRibuan) {
            System.out.println("Semua bilangan adalah ribuan.");
        } else {
            System.out.println("Tidak semua bilangan adalah ribuan.");
        }
    }

    public static boolean checkIfThousand(int num) {
        return num > 999 && num < 10000;
    }
}

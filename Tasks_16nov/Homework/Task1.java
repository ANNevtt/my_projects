package org.example.Tasks2.Homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите основание системы счисления: ");
        int k = scanner.nextInt();

        System.out.print("Введите число n в k-ичной системе: ");
        int n = scanner.nextInt();

        int decimalValue = 0;
        int power = 0;

        while (n > 0) {
            int digit = n % 10;
            decimalValue += digit * Math.pow(k, power);
            power++;
            n /= 10;
        }

        System.out.println("Число n в десятичной системе счисления: " + decimalValue);

        scanner.close();
    }
}
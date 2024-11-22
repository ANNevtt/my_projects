package org.example.Tasks_16nov.Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.141592653589793;

        System.out.print("Введите целое число m: ");
        int m = scanner.nextInt();
        System.out.print("Введите целое число n (не равное m): ");
        int n = scanner.nextInt();

        if (m == n) {
            System.out.println("Числа m и n должны быть различны.");
            return;
        }

        double fraction1 = (double) m / n; // m / n
        double fraction2 = (double) n / m; // n / m

        double diff1 = Math.abs(fraction1 - PI);
        double diff2 = Math.abs(fraction2 - PI);

        if (diff1 < diff2) {
            System.out.println("Дробь m/n ближе к π.");
            m *= 10;
            System.out.println("Новое значение m: " + m);
        } else {
            System.out.println("Дробь n/m ближе к π.");
            n *= 2;
            System.out.println("Новое значение n: " + n);
        }
    }
}
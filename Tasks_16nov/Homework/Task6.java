package org.example.Tasks_16nov.Homework;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите действительное число a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        // выражение г)
        double sum = 0.0;
        double currentTerm = 1.0 / a;
        for (int i = 1; i <= n; i++) {
            sum += currentTerm;
            currentTerm /= (a * a);
        }

        // выражение д)
        double product = a;
        for (int i = 1; i <= n; i++) {
            product *= (a - i * n);
        }

        System.out.printf("Результат выражения Г: %.6f%n", sum);
        System.out.printf("Результат выражения Д: %.6f%n", product);
    }
}
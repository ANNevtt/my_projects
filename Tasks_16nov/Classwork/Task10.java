package org.example.Tasks_16nov.Classwork;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов последовательности: ");
        int n = scanner.nextInt();

        double[] sequence = new double[n];
        System.out.println("Введите элементы последовательности:");
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double value : sequence) {
            if (value > 0) {
                sum += value;
            }
        }
        double doubleSum = 2 * sum;

        System.out.println("Удвоенная сумма всех положительных элементов: " + doubleSum);

        scanner.close();
    }
}

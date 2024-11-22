package org.example.Tasks_16nov.Homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов в последовательности: ");
        int n = scanner.nextInt();

        double[] sequence = new double[n];

        System.out.println("Введите элементы последовательности:");
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (sequence[i] < 0) {
                sequence[i] += 0.5;
            } else {
                sequence[i] = 0.1;
            }
        }

        System.out.println("Изменённая последовательность:");
        for (double num : sequence) {
            System.out.printf("%.2f ", num);
        }
    }
}
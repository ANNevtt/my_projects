package org.example.Tasks_16nov.Homework;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Размер массива должен быть положительным");
            return;
        }

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = (i % 2 == 0) ? (2 * i + 1) : -(2 * i + 1);
        }

        System.out.println("Полученный массив:");
        for (int element : a) {
            System.out.print(element + " ");
        }
    }
}
package org.example.Tasks_16nov.Homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов последовательности: ");
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("Последовательность слишком короткая для локальных максимумов.");
            return;
        }

        int[] sequence = new int[n];
        System.out.println("Введите элементы последовательности:");
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        int evenLocalMaxCount = 0;

        for (int i = 1; i < n - 1; i++) {
            if (sequence[i] > sequence[i - 1] && sequence[i] > sequence[i + 1]) {
                if (sequence[i] % 2 == 0) {
                    evenLocalMaxCount++;
                }
            }
        }

        if (evenLocalMaxCount == 2) {
            System.out.println("В последовательности ровно два чётных локальных максимума.");
        } else {
            System.out.println("Количество чётных локальных максимумов: " + evenLocalMaxCount);
        }
    }
}
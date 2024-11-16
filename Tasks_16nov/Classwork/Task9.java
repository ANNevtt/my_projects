package org.example.Tasks_16nov.Classwork;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов последоватльности: ");
        int n = scanner.nextInt();

        int[] sequence = new int[n];
        System.out.println("Введите элементы последовательности:");
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        int count = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (sequence[i] % 5 == 0 && sequence[i] % 7 != 0) {
                count++;
                sum += sequence[i];
            }
        }

        System.out.println("Количество элементов, которые делятся на 5 и не делятся на 7: " + count);
        System.out.println("Сумма этих элементов: " + sum);

        scanner.close();
    }
}

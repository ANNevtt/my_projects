package org.example.Tasks_16nov.Classwork;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину последовательности: ");
        int n = scanner.nextInt();

        int[] sequence = new int[n];
        System.out.println("Введите элементы последовательности:");
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        boolean evenLocalMaxFound = false;
        for (int i = 1; i < n - 1; i++) {
            if (sequence[i] > sequence[i - 1] && sequence[i] > sequence[i + 1] && sequence[i] % 2 == 0) {
                evenLocalMaxFound = true;
                System.out.println("Найден четный локальный максимум: " + sequence[i]);
                break;
            }
        }

        if (!evenLocalMaxFound) {
            System.out.println("Четный локальный максимум не найден в последовательности.");
        }

        scanner.close();
    }
}

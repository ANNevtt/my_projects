package org.example.Tasks_16nov.Classwork;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов последовательности: ");
        int n = scanner.nextInt();

        long product = 1;
        boolean found = false;

        System.out.println("Введите элементы последовательности:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num % 7 == 0) {
                product *= num;
                found = true;
            }
        }

        if (found) {
            System.out.println("Произведение элементов последовательности, кратных 7: " + product);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}

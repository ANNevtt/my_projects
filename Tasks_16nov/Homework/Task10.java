package org.example.Tasks_16nov.Homework;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст человека (натуральное число n, n <= 100): ");
        int n = scanner.nextInt();

        if (n < 1 || n > 100) {
            System.out.println("Возраст должен быть в диапазоне от 1 до 100");
            return;
        }

        String suffix;
        if (n % 10 == 1 && n % 100 != 11) {
            suffix = "год";
        } else if ((n % 10 >= 2 && n % 10 <= 4) && !(n % 100 >= 12 && n % 100 <= 14)) {
            suffix = "года";
        } else {
            suffix = "лет";
        }

        System.out.println(n + " " + suffix);
    }
}
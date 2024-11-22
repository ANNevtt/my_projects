package org.example.Tasks_16nov.Homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел n: ");
        int n = scanner.nextInt();

        int count = 0;

        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (isValidNumber(number)) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Среди введенных чисел ровно два таких, которые соответствуют заданным условиям.");
        } else {
            System.out.println("Условие не выполнено: подходящих чисел " + count);
        }
    }

    public static boolean isValidNumber(int number) {
        number = Math.abs(number);

        int length = String.valueOf(number).length();
        if (length != 3 && length != 5) {
            return false;
        }

        boolean allEven = true;
        boolean allOdd = true;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                allOdd = false;
            } else {
                allEven = false;
            }
            number /= 10;
        }

        return allEven || allOdd;
    }
}
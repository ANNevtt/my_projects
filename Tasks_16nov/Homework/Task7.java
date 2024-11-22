package org.example.Tasks_16nov.Homework;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите натуральное число n (n <= 100): ");
        int n = scanner.nextInt();

        if (n < 1 || n > 100) {
            System.out.println("Число n должно быть натуральным и не больше 100!");
            return;
        }

        String numberStr = String.valueOf(n);

        // a
        int digitCount = numberStr.length();

        // b
        int sumOfDigits = 0;
        for (char digit : numberStr.toCharArray()) {
            sumOfDigits += Character.getNumericValue(digit);
        }

        // c
        int firstDigit = Character.getNumericValue(numberStr.charAt(0));

        // d
        Integer secondLastDigit = null;
        if (n >= 10) {
            secondLastDigit = Character.getNumericValue(numberStr.charAt(numberStr.length() - 2));
        }

        System.out.println("Результаты анализа числа " + n + ":");
        System.out.println("a) Количество цифр в числе: " + digitCount);
        System.out.println("b) Сумма цифр числа: " + sumOfDigits);
        System.out.println("c) Первая цифра числа: " + firstDigit);
        if (secondLastDigit != null) {
            System.out.println("d) Предпоследняя цифра числа: " + secondLastDigit);
        } else {
            System.out.println("d) У числа нет предпоследней цифры, так как оно меньше 10.");
        }
    }
}
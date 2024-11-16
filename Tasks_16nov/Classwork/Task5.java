package org.example.Tasks_16nov.Classwork;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите порядковый номер месяца: ");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            int monthsLeft = 12 - month;
            System.out.println("Количество месяцев, оставшихся до конца года: " + monthsLeft);
        } else {
            System.out.println("Ошибка: введите номер месяца от 1 до 12.");
        }

        scanner.close();
    }
}

package org.example.Tasks_16nov.Classwork;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите действительное число x: ");
        double x = scanner.nextDouble();

        // Меню
        System.out.println("Выберите номер действия:");
        System.out.println("1 – возвести число в квадрат");
        System.out.println("2 – извлечь квадратный корень");
        System.out.println("3 – вычислить синус");
        System.out.println("4 – вычислить косинус");

        // Номер действия
        System.out.print("Введите номер действия: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Результат: " + (x * x));
                break;
            case 2:
                if (x >= 0) {
                    System.out.println("Результат: " + Math.sqrt(x));
                } else {
                    System.out.println("Ошибка: нельзя извлечь корень из отрицательного числа.");
                }
                break;
            case 3:
                System.out.println("Результат: " + Math.sin(Math.toRadians(x)));
                break;
            case 4:
                System.out.println("Результат: " + Math.cos(Math.toRadians(x)));
                break;
            default:
                System.out.println("Ошибка: неверный номер действия.");
                break;
        }

        scanner.close();
    }
}

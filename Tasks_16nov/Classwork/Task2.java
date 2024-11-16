package org.example.Tasks_16nov.Classwork;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите время(только часы): ");
        int time = scanner.nextInt();

        if (time >= 0 && time < 4) {
            System.out.println("Доброй ночи");
        } else if (time >= 4 && time < 12) {
            System.out.println("Доброе утро");
        } else if (time >= 12 && time < 17) {
            System.out.println("Добрый день");
        } else if (time >= 17 && time <= 23) {
            System.out.println("Добрый вечер");
        } else {
            System.out.println("Некорректное значение.");
        }

        scanner.close();
    }
}


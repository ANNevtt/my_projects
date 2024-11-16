package org.example.Tasks_16nov.Classwork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку: ");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Плохо");
        } else {
            if (a == 2) {
                System.out.println("Неудовлетворительно");
            } else {
                if (a == 3) {
                    System.out.println("Удовлетворительно");
                } else {
                    if (a == 4) {
                        System.out.println("Хорошо");
                    } else {
                        if (a == 5) {
                            System.out.println("Отлично");
                        } else {
                            System.out.println("Ошибка");
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}
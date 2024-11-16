package org.example.Tasks_9nov;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите первое число:");
            int a = in.nextInt();
            System.out.println("Введите второе число:");
            int b = in.nextInt();
            int sum = a+b;
            System.out.println("Сумма = "+sum);
        } catch (Exception e) {
            System.out.println("Неверные данные!");
        }
    }
}
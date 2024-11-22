package org.example.Tasks_16nov.Homework;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите действительное число a: ");
        double a = scanner.nextDouble();

        // в
        double f_v;
        if (a <= 0) {
            f_v = 0;
        } else if (a > 0 && a <= 1) {
            f_v = a;
        } else {
            f_v = Math.pow(a, 4);
        }

        // вывод в
        System.out.println("Значение f(a) для случая (в): " + f_v);

        // г
        double f_g;
        if (a <= 0) {
            f_g = 0;
        } else if (a > 0 && a <= 1) {
            f_g = Math.pow(a, 2) - a;
        } else {
            f_g = Math.pow(a, 2) - Math.sin(Math.PI * Math.pow(a, 2));
        }

        // вывод г
        System.out.println("Значение f(a) для случая (г): " + f_g);
    }
}
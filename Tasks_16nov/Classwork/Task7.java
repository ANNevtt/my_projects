package org.example.Tasks_16nov.Classwork;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число b: ");
        int b = scanner.nextInt();

        System.out.print("Введите действительное число z: ");
        double z = scanner.nextDouble();

        int x = a % b;

        if (x == 0) {
            z = z * x;
            System.out.println("Новое значение z: " + z);
        } else {
            z = z / x;
            System.out.println("Новое значение z: " + z);
        }

        scanner.close();
    }
}

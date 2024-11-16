package org.example.Tasks_16nov.Classwork;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Символ
        System.out.print("Введите символ от 'a' до 'f': ");
        char inputChar = scanner.next().charAt(0);

        if (inputChar >= 'a' && inputChar <= 'f') {
            char upperChar = Character.toUpperCase(inputChar);
            System.out.println("Заглавная буква: " + upperChar);
        } else {
            System.out.println("Ошибка: введенный символ не находится в диапазоне от 'a' до 'f'.");
        }

        scanner.close();
    }
}

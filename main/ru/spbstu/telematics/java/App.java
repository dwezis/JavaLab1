package ru.spbstu.telematics.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    // Метод для поиска делителей числа
    public static List<Integer> findDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        int absoluteNumber = Math.abs(number); // Работаем с модулем числа
        for (int i = 1; i <= absoluteNumber; i++) {
            if (absoluteNumber % i == 0) {
                if (number < 0) {
                    divisors.add(-i); // Добавляем отрицательные делители
                }
                divisors.add(i); // Добавляем положительные делители
            }
        }
        // Сортируем список, чтобы порядок был правильным
        Collections.sort(divisors);
        return divisors;
    }

    // Главный метод программы
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для ввода данных

        System.out.print("Введите число, для которого нужно найти делители: ");
        while (!scanner.hasNextInt()) { // Проверяем, что пользователь ввел целое число
            System.out.println("Ошибка! Введите целое число.");
            System.out.print("Попробуйте снова: ");
            scanner.next(); // Очищаем буфер ввода
        }

        int number = scanner.nextInt(); // Считываем введенное число
        List<Integer> divisors = findDivisors(number); // Находим делители

        // Выводим результат
        System.out.println("Делители числа " + number + ": " + divisors);

        scanner.close(); // Закрываем сканер
    }
}
package ru.spbstu.telematics.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

    public static List<Integer> findDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        int absoluteNumber = Math.abs(number);
        for (int i = 1; i <= absoluteNumber; i++) {
            if (absoluteNumber % i == 0) {
                if (number < 0) {
                    divisors.add(-i);
                }
                divisors.add(i);
            }
        }

        Collections.sort(divisors);
        return divisors;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for which you need to find divisors: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error! Please enter an integer");
            System.out.print("Try again: ");
            scanner.next();
        }

        int number = scanner.nextInt();
        List<Integer> divisors = findDivisors(number);


        System.out.println("Divisors of a number " + number + ": " + divisors);

        scanner.close();
    }
}
package ru.spbstu.telematics.java;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testFindDivisors() {
        // Тест для положительного числа 12
        List<Integer> expectedPositive = Arrays.asList(1, 2, 3, 4, 6, 12);
        List<Integer> actualPositive = App.findDivisors(12);
        assertEquals("Делители числа 12 должны быть [1, 2, 3, 4, 6, 12]", expectedPositive, actualPositive);

        // Тест для отрицательного числа -4
        List<Integer> expectedNegative = Arrays.asList(-4, -2, -1, 1, 2, 4);
        List<Integer> actualNegative = App.findDivisors(-4);
        assertEquals("Делители числа -4 должны быть [-4, -2, -1, 1, 2, 4]", expectedNegative, actualNegative);

        // Тест для числа 1
        List<Integer> expectedOne = Arrays.asList(1);
        List<Integer> actualOne = App.findDivisors(1);
        assertEquals("Делители числа 1 должны быть [1]", expectedOne, actualOne);

        // Тест для числа -1
        List<Integer> expectedMinusOne = Arrays.asList(-1, 1);
        List<Integer> actualMinusOne = App.findDivisors(-1);
        assertEquals("Делители числа -1 должны быть [-1, 1]", expectedMinusOne, actualMinusOne);
    }
}
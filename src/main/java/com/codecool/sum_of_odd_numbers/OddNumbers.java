package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {

        int sumOfOddNumbers = 0;

        for (Integer number : numbers) {
            if (number % 2 != 0) {
                sumOfOddNumbers += number;
            }
        }

        return sumOfOddNumbers;
    }
}
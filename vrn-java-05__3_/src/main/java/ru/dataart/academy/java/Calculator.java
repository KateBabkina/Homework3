package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        return reverseNumber(firstNumber) + reverseNumber(secondNumber);
    }

    private Integer reverseNumber(List<Integer> number) {
        int reversedNumber = 0;
        for (int index = number.size() - 1; index >= 0; index--) {
            reversedNumber = reversedNumber * 10 + number.get(index);
        }
        return reversedNumber;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> listOfOddElements = new ArrayList<>();
        for (int index = 0; index < list.size(); index += 2) {
            listOfOddElements.add(list.get(index));
        }
        return listOfOddElements;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        if (list.size() == 0) {
            return Collections.emptyList();
        }
        List<T> listOfBounds = new ArrayList<>();
        listOfBounds.add(list.get(0));
        if (list.size() > 1) {
            listOfBounds.add(list.get(list.size() - 1));
        }
        return listOfBounds;
    }
}

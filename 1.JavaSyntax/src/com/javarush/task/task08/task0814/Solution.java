package com.javarush.task.task08.task0814;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 7, 9, 4, 34, 5, 11, 2, 45, 812));
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        set.removeIf(x -> x > 10);
//        for (Integer x : set) {
//            if (x > 10) set.remove(x);
//        }
        return set;
    }

    public static void main(String[] args) {
//        System.out.println(removeAllNumbersGreaterThan10(createSet()));
    }
}

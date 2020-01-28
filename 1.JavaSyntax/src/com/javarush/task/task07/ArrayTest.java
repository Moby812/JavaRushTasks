package com.javarush.task.task07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayTest {
    public static void main(String[] args) {


        int[] arrayNumbers = {8, -7, 6, 0, -1, 3, 2, 1};     //быстрая инициализация массива

        Arrays.sort(arrayNumbers);                           //быстрая сортировка массива посредством Arrays.sort



        ArrayList<Integer> arrayListNumbers = new ArrayList<>();    //создание листа
        arrayListNumbers.add(8);                                    //заполнение листа данными
        arrayListNumbers.add(-7);
        arrayListNumbers.add(6);
        arrayListNumbers.add(0);
        arrayListNumbers.add(-1);
        arrayListNumbers.add(3);
        arrayListNumbers.add(2);
        arrayListNumbers.add(1);

        Collections.sort(arrayListNumbers);                     //быстрая сортировка листа посредством Collections.sort


        for (int x: arrayNumbers) System.out.print(x + " ");     //вывод всего массива
        System.out.println();
        for (int x: arrayListNumbers) System.out.print(x + " ");     //вывод всего массива
    }
}

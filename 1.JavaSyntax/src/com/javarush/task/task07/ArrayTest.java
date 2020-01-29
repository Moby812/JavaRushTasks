package com.javarush.task.task07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayTest {    //http://study-java.ru/uroki-java/urok-11-sortirovka-massiva/
    public static void main(String[] args) {


        int[] arrayNumbers = {8, -7, 6, 0, -1, 3, 2, 1};     //быстрая инициализация массива

//        Arrays.sort(arrayNumbers);                           //быстрая сортировка массива посредством Arrays.sort

        for (int i = arrayNumbers.length -1; i > 0; i--){            //сортировка пузырьковым методом
                                                                    /*Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний цикл каждый раз ставит в конец фрагмента максимальный элемент*/
            for (int j = 0; j < i; j++) {
                                                                    /*Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами*/
                if (arrayNumbers[j] > arrayNumbers[j+1]) {          //Сравниваем ближайшие ячейки массива
                    int max = arrayNumbers[j];                      //выделяем наибольшее значение
                    arrayNumbers[j] = arrayNumbers[j+1];            //меняем ячейки массива местами путем пересвоения (используя переменную max)
                    arrayNumbers[j+1] = max;
                }
            }
        }


        ArrayList<Integer> arrayListNumbers = new ArrayList<>();    //создание листа
        arrayListNumbers.add(8);                                    //заполнение листа данными
        arrayListNumbers.add(-7);
        arrayListNumbers.add(6);
        arrayListNumbers.add(0);
        arrayListNumbers.add(-1);
        arrayListNumbers.add(3);
        arrayListNumbers.add(2);
        arrayListNumbers.add(1);

//        Collections.sort(arrayListNumbers);                                 //быстрая сортировка листа посредством Collections.sort

        for (int i = 0; i < arrayListNumbers.size(); i++) {                    //сортировка выбором
                                                                              /*Предполагаем, что первый элемент (в каждом подмножестве элементов) является минимальным */
            int min = arrayListNumbers.get(i);          //запоминаем значение в ячейке i
            int min_i = i;                              //запоминаем номер ячейки i
                                                                             /*В оставшейся части подмножества ищем элемент, который меньше предположенного минимума*/
            for (int j = i+1; j < arrayListNumbers.size(); j++) {            //сравниваем i и j (i+1) если значение J меньше, то считаем его теперь наименьшим

                if (arrayListNumbers.get(j) < min) {
                    min = arrayListNumbers.get(j);                             //Если находим, запоминаем его индекс
                    min_i = j;
                }
            }
                                                                              /*Если нашелся элемент, меньший, чем на текущей позиции, меняем их местами*/
            if (i != min_i) {
                int tmp = arrayListNumbers.get(i);                          //копируем большее значение в переменную
                arrayListNumbers.set (i, arrayListNumbers.get(min_i));      //меняем ячейки местами путем пересвоения (используя переменную tmp)
                arrayListNumbers.set (min_i, tmp);
            }
        }


        for (int x: arrayNumbers) System.out.print(x + " ");     //вывод всего массива
        System.out.println();
        for (int x: arrayListNumbers) System.out.print(x + " ");     //вывод всего массива
    }
}

package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких

1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] twenty = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i < twenty.length;i++){
            int number = Integer.parseInt(reader.readLine());
            twenty[i]= number;
        }

        int[] tenOne = new int[10];
        int[] tenTwo = new int[10];
        int countOne=0;
        int countTwo=0;

        for (int i=0; i < twenty.length;i++){
            if (i <10) {
                tenOne[countOne] = twenty[i];
                countOne++;
            }
            else {
                tenTwo[countTwo] = twenty[i];
                countTwo++;
            }
        }

        for (int value : tenTwo) {
            System.out.println(value);
        }
    }
}

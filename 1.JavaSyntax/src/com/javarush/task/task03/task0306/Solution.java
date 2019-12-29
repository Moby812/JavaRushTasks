package com.javarush.task.task03.task0306;

/* 
Головоломка со скобками 382
Решение будет очевидным если учесть,
 что 382 = 191*2, далее 191 это число простое,
 значит мы не делим, а вычитаем 3. 191-3 = 188, а 188 делится на 4 нацело и т. д.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(((2 * 3 + 4) * 5 + 6) * 7);
    }
}

package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> listString = new ArrayList<String>();
        listString.add(0,"мама ");
        listString.add(1,"мыла ");
        listString.add(2,"раму ");
        listString.add(3,"ржавой ");
        listString.add(4,"мочалкой");

        System.out.println(listString.size());

        for (String value : listString) {
            System.out.println(value);
        }
    }
}

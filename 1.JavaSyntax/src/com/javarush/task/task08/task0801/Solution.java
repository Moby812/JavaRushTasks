package com.javarush.task.task08.task0801;

/* 
Set из растений

Создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё 10 строк
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> plants = new HashSet<String>();
        plants.add("арбуз");
        plants.add("банан");
        plants.add("вишня");
        plants.add("груша");
        plants.add("дыня");
        plants.add("ежевика");
        plants.add("женьшень");
        plants.add("земляника");
        plants.add("ирис");
        plants.add("картофель");

//        for (String text: plants) System.out.println(text);

        Iterator<String> iterator = plants.iterator();

        while (iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }
    }
}

package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Павел", 812);
        map.put("Деймон", 666);
        map.put("Александр", 500);
        map.put("Вадим", 100);
        map.put("Николай", 747);
        map.put("Мария", 505);
        map.put("Тимур", 50);
        map.put("Олег", 5000);
        map.put("Боря", 5);
        map.put("Михаил", 499);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
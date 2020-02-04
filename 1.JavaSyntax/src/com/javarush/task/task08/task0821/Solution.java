package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Парамонов", "Павел");
        map.put("Парамонова", "Катерина");
        map.put("Парамонов", "Олег");
        map.put("Басов", "Илья");
        map.put("Овчинников", "Илья");
        map.put("Самушенков", "Стас");
        map.put("Наумкин", "Михаил");
        map.put("Лузгин", "Михаил");
        map.put("Иванов", "Натаниэль");
        map.put("Иванов", "Константин");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

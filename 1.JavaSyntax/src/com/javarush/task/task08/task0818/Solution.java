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
            map.values().removeIf(x -> x < 500);
    }

    public static void main(String[] args) {
//        Map<String, Integer> result = createMap();
//        removeItemFromMap(result);

//        result.entrySet().stream()                                                      //http://devify.ru/p/5c5c1a699194be0001bcf9d8 Сортировка карты по value
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .forEach(System.out::println); // или любой другой конечный метод

//        for (Map.Entry<String,Integer> pair: result.entrySet()) {
//            String key = pair.getKey();
//            Integer value = pair.getValue();
//            System.out.println(key +" зарабатывает: "+ value);
//        }
    }
}
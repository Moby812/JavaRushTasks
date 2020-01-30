package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.


*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String, String> different = new HashMap<>();
        different.put("арбуз", "ягода");
        different.put("банан", "трава");
        different.put("вишня", "ягода");
        different.put("груша", "фрукт");
        different.put("дыня", "овощ");
        different.put("ежевика", "куст");
        different.put("жень-шень", "корень");
        different.put("земляника", "ягода");
        different.put("ирис", "цветок");
        different.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : different.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key +" - "+ value);
        }
    }
}

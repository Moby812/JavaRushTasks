package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> fio = new HashMap<>();
        fio.put("Парамонов", "Павел");
        fio.put("Гончарова", "Екатерина");
        fio.put("Овчинников", "Илья");
        fio.put("Камчатнов", "Кирилл");
        fio.put("Уланов", "Денис");
        fio.put("Басов", "Илья");
        fio.put("Рачков", "Александр");
        fio.put("Шатров", "Алексей");
        fio.put("Наумкин", "Михаил");
        fio.put("Якушин", "Алексей");
        return fio;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String fioName = pair.getValue();
        }
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}

package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> fio = new HashMap<>();
        fio.put("Парамонов", "Павел");
        fio.put("Гончарова", "Екатерина");
        fio.put("Овчинников", "Илья");
        fio.put("Камчатнов", "Кирилл");
        fio.put("Басов", "Илья");
        fio.put("Рачков", "Александр");
        fio.put("Шатров", "Алексей");
        fio.put("Наумкин", "Михаил");
        fio.put("Якушин", "Алексей");
        fio.put("Мазин", "Алексей");
        return fio;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);                                                                  //создаём копию переданного в параметры списка
        for (Map.Entry<String, String> pair : copy.entrySet()) {                                                        //для всех элементов нового списка
            String value = pair.getValue();                                                                             //сохраняем значение в переменную
            // TODO: 2020-02-03 сейчас, он перебирает всех в переменную value

            for (Map.Entry<String, String> x : copy.entrySet()) {
                if (x.getValue().equals(value))

                removeItemFromMapByValue(map, value);                                                //вызываем метод удаления ключа из введённого в параметрах списока (которое получаем посредством перебора списка)
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {        //принимаем в параметрах список и значение (при совпаденииБ ключь которого будем удалять из списка)
        Map<String, String> copy = new HashMap<>(map);                                                                  //создаём копию переданного в параметры списка
        for (Map.Entry<String, String> pair : copy.entrySet()) {                                                        //для всех элементов нового списка
            if (pair.getValue().equals(value)) {                                                                        //если имя равняется имени из параметра
                map.remove(pair.getKey());                                                                              //тогда в основном списке удалять ключ
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("В создаваемом списке: " + Solution.createMap().size() + " записей");

        Map<String, String> result = createMap();
        removeTheFirstNameDuplicates(result);
//        removeItemFromMapByValue(result, "Илья");
        System.out.println("количество повторяющихся имён: ");
        System.out.println("После чистки: " + result.size());                                                           //должно вывести 5 (-2 Ильи и -3 Алексея)

    }
}

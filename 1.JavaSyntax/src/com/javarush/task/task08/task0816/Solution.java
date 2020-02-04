package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Павел", dateFormat.parse("APR 4 1989"));
        map.put("Катерина", dateFormat.parse("AUG 20 1994"));
        map.put("Олег", dateFormat.parse("AUG 7 2019"));
        map.put("Юлия", dateFormat.parse("DEC 31 1964"));
        map.put("Ленин", dateFormat.parse("APR 22 1870"));
        map.put("Сталин", dateFormat.parse("DEC 18 1878"));
        map.put("Эйнштейн", dateFormat.parse("MAR 14 1879"));
        map.put("Никола", dateFormat.parse("JUL 10 1856"));
        map.put("Чарльз", dateFormat.parse("FEB 12 1809"));
    return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        DateFormat dateFormatOnlyMount = new SimpleDateFormat("M");

        for (Map.Entry<String, Date> pair: map.entrySet()){
            Date birthDay = pair.getValue();
//            dateFormatOnlyMount.format(birthDay);
            System.out.println(dateFormatOnlyMount.format(birthDay));
        }
        map.values().removeIf(x -> x.after() && x.before());        //Удаляем строки в которых Х.ПОЗЖЕ (дата) и Х.РАНЬШЕ (дата)
    }

    public static void main(String[] args) throws ParseException {
removeAllSummerPeople(createMap());
//        System.out.println(createMap().values());
    }
}

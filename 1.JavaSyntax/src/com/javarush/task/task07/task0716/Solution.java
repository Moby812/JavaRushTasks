package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л

2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        for (int i = 0; i < strings.size() ; i++) {
            String str = strings.get(i);
//            if (str.contains("р") == true && str.contains("л") == false)
            if (str.contains("р") && !str.contains("л")) {
                strings.remove(i);
                i--;
            }
            else if (!str.contains("р") && str.contains("л")) strings.add(i, str);
        }
        return strings;
    }
}
package com.javarush.task.task08.task0813;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
Set<String> text= new HashSet<>(Arrays.asList("Лодка", "Лестница", "Лоджия", "Ленинград", "Люди", "Любовь", "Лёд", "Ледокол", "Лик", "Лук"));

text.add("Лолита");
text.add("Линкольн");
text.add("Лида");
text.add("Лада");
text.add("Линька");
text.add("Лена");
text.add("Лидия");
text.add("Лев");
text.add("Лифт");
text.add("Лифчик");

return text;
    }

    public static void main(String[] args) {

    }
}

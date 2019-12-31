package com.javarush.task.task03.task0316;

/* 
Экранирование символов
\” – экранирование двойной кавычки;
\\ – экранирование обратной косой черты (\)
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\""); //It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\""); //It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
    }
}
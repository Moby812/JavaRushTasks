package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);


        removeCats(pets, cats);
//        printPets(pets);
        System.out.println();
        for (Cat x: cats) System.out.println(x);        // TODO: 2020-02-04 бахнуть эту запись
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код. Step 2
        for (int i = 0; i <4 ; i++) {
            result.add(new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код. Step 3
        Set<Dog> dogs = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            dogs.add(new Dog());
        }
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код. Step 4
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);                                                                                            // в список animal добавляем всех котов и собак
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код. Step 5              метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
        for (Object p: pets) {

            // TODO: 2020-02-04
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код. Step 6
        for (Object x: pets) System.out.println(x);
    }

    //напишите тут ваш код. Step 1
    public static class Cat {
    }

    public static class Dog {
    }
}

package ru.ayupov.task12;

/**
 * Заставить программу упасть Смоделировав ошибку «NullPointerException»
 */

public class NullPointerException {

    public static void main(String[] args) {
        String str = null;

        if (str.equals("Hello World!")) ;
        {
            System.out.println("Test");
        }
    }

}

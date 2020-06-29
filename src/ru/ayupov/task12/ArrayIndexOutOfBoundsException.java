package ru.ayupov.task12;

/**
 * Заставить программу упасть Смоделировав ошибку «ArrayIndexOutOfBoundsException»
 */

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[5] = 12;
    }
}

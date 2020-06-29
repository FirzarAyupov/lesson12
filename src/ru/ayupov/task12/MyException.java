package ru.ayupov.task12;

/**
 * Заставить программу упасть вызвав свой вариант ошибки через оператор throw
 */

public class MyException {

    public static void main(String[] args) throws ComputerError {
        startComputer();
    }

    static void startComputer() throws ComputerError {
        System.out.println("Компьютер включен");
        int temperature = 20;
        for (int i = 0; i < 4; i++) {
            if (temperature < 80) {
                System.out.println("Температура процессора " + temperature);
                temperature += 20;
            } else {
                throw new ComputerError("Перегрев CPU! " + temperature + " градусов");
            }
        }

    }
}

class ComputerError extends Error {
    public ComputerError(String message) {
        super(message);
    }
}
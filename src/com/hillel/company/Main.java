package com.hillel.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        try {
            //region Task1
            TasksException.checkNumberIsZero(0);
            TasksException.checkNumberIsZero(5);
            //endregion

            //region Task2
            System.out.println("Task 2:");
            TasksException.divideByZero();
            //endregion

            //region Task3
            System.out.println("Task 3:");
            TasksException.divide(args);
            args = new String[]{"Hello", "Its", "SMTH"};
            TasksException.divide(args);
            //endregion

            //region Task4
            System.out.println("Task 4:");
            TasksException.anotherDivide();
            //endregion

            //region Task5
            System.out.println("Task 5:");
            TasksException.iCanThrowException();
            //endregion

            //region Task6
            System.out.println("Task 6:");
            TasksException.readData();
            //endregion

            //region Task7
            System.out.println("Task 7:");
            Set<Example> s = new HashSet<>();
            s.add(new Example("Donald", "Duck"));
            System.out.println(s.contains(new Example("Donald", "Duck")));
            //endregion

        } catch (Exception e) {
            System.err.println("We catch exceptions. Details| " + e);
        }
    }
}

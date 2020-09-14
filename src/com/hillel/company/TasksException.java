package com.hillel.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TasksException {

    public static void checkNumberIsZero(int number) throws Exception {
        if (number > 0 | number < 0){
            System.out.println(number > 0 ? "Number > 0" : "Number < 0");
        }else throw new Exception("Number is zero!");
    }

    public static int divideByZero(){
        int a = 5;
        int b = 0;
        try {
            return a/b;
        }catch (ArithmeticException e){
            System.err.println("Arithmetic exception was cached. Details: " + e.getMessage());
            return  0;
        }
    }

    public static void divide(String [] args){
        try {
            int a = args.length;
            System.out.println(a);

            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[1]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.err.println("Exception. Details: " + e);
        }
    }

    public static void anotherDivide(){
        try {
            int a = 0;
            int b = 4 / a;
        } catch (ArithmeticException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void iCanThrowException(){
        throw new NullPointerException("I can throw new Exception");
    }

    public static void readData(){
        List<Integer> numbers = new ArrayList<Integer>();
        int i = 0;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in)) ){
            while (i < 5){
                System.out.println("Please enter a number: ");
                int number = Integer.parseInt(in.readLine());
                numbers.add(number);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException nm){
            System.err.println("Exception was appeared. All items from array: " + Arrays.toString(numbers.toArray()));
        }

    }

}

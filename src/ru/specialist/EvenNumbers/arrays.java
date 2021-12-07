package ru.specialist.EvenNumbers;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        //Task #1
        int[] array = {8, 10, 5, 20, 7, 15, 18};
        showArray(array);
        System.out.println();
        System.out.println("Count of even numbers array: " + arrayEvenNumbersCount(array));
        System.out.println("--------");
        //Task #2
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(20);
        arrayList.add(7);
        arrayList.add(15);
        arrayList.add(18);
        System.out.println(arrayList);
        System.out.println(arrayListEvenNumbers(arrayList));
        System.out.println("--------");
        //Task #3
        showArray(array);
        int[] arrayWithOnlyEvenNumbers = arrayEvenNumbers(array);
        System.out.println();
        showArray(arrayWithOnlyEvenNumbers);
    }

    /*This is a method what takes an array
     * and returns an array with only even number */
    public static int[] arrayEvenNumbers(int[] array) {
        int numberSortedSize = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                numberSortedSize++;
            }
        }

        int[] arrayEvenNumbers = new int[numberSortedSize];

        int numberSortedId = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                arrayEvenNumbers[numberSortedId] = array[i];
                numberSortedId++;
            }
        }
        return arrayEvenNumbers;
    }

    ;


    /*This method that return count of even
    numbers in the input array.*/
    public static int arrayEvenNumbersCount(int[] array) {
        int numberSortedSize = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                numberSortedSize++;
            }
        }

        return numberSortedSize;
    }

    ;

    /*This method that show all numbers of array*/
    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /*This is a method what takes an arrayList
     * and returns an arrayList with only even number */
    public static ArrayList<Integer> arrayListEvenNumbers(ArrayList<Integer> arrayList) {
        ArrayList<Integer> arrayListEvenNumbers = new ArrayList<Integer>();
        for (int a : arrayList) {
            if (a % 2 == 0) {
                arrayListEvenNumbers.add(a);
            }
        }
        return arrayListEvenNumbers;
    }
}

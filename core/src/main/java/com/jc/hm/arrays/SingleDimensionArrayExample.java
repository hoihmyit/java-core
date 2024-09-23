package com.jc.hm.arrays;

public class SingleDimensionArrayExample {
    public static void main(String[] args) {
        // Declare an array
        //int[] arr;
        // Allocate memory for 5 integers
        //arr = new int[5];

        // Initializing an array
        int[] arr = new int[]{10, 20, 30, 40, 50};

        // Access the elements of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " : " + arr[i]);
            //Element at index 0 : 10
            //Element at index 1 : 20
            //Element at index 2 : 30
            //Element at index 3 : 40
            //Element at index 4 : 50
        }
        System.out.println("******************************");
        //******************************
        // Declare and assign values to an array
        int[] arr2 = new int[2];
        arr2[0] = 100;
        arr2[1] = 200;

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Element at index " + i + " : " + arr2[i]);
            //Element at index 0 : 100
            //Element at index 1 : 200
        }
    }
}

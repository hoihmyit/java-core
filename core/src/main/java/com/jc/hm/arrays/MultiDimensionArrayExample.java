package com.jc.hm.arrays;

public class MultiDimensionArrayExample {
    public static void main(String[] args) {
        // Declare a 2D array
        int[][] arr = new int[2][3];
        // Initialize the array
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;
        // Access the elements of the array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Element at index [" + i + "][" + j + "] : " + arr[i][j]);
                //Element at index [0][0] : 10
                //Element at index [0][1] : 20
                //Element at index [0][2] : 30
                //Element at index [1][0] : 40
                //Element at index [1][1] : 50
                //Element at index [1][2] : 60
            }
        }
        System.out.println("******************************");
        //******************************
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Element at index [" + i + "][" + j + "] : " + arr2[i][j]);
                //Element at index [0][0] : 1
                //Element at index [0][1] : 2
                //Element at index [0][2] : 3
                //Element at index [1][0] : 4
                //Element at index [1][1] : 5
                //Element at index [1][2] : 6
            }
        }
    }
}

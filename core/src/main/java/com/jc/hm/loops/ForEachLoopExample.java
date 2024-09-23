package com.jc.hm.loops;

public class ForEachLoopExample {
    public static void main(String[] args) {
        String[] name = {"John", "Art", "Cat", "Cute"};

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        //John
        //Art
        //Cat
        //Cute

        for (String n : name) {
            System.out.println(n);
        }
        //John
        //Art
        //Cat
        //Cute

    }
}

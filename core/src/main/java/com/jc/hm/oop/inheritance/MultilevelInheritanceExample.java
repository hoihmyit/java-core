package com.jc.hm.oop.inheritance;

/**
 * In Multilevel Inheritance, a derived class will be inheriting a base class,
 * and as well as the derived class also acts as the base class for other classes.
 */
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
        //Weeping...
        //Barking...
        //Eating...
    }
}

package com.jc.hm.oop.inheritance;

/**
 * In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass.
 */
public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        //Meowing...
        //Eating...
        //c.bark(); //Compilation Error
    }
}

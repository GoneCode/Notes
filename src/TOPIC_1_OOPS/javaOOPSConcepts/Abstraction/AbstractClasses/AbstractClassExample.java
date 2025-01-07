package javaOOPSConcepts.Abstraction.AbstractClasses;

import javaOOPSConcepts.Polymorphism.MethodOverriding.ClassB;

public abstract class AbstractClassExample extends ClassD implements InterfaceA,InterfaceB{

    // final variable
    public final int a=10;
    // non final variable
    public int b=100;
    // static variable
    final static String schoolName="MMS";
    // non static variable
    String name;

    // abstract method
    public abstract int add(int a,int b);

    // non abstract method
    public int multiply(int a,int b){
        return a*b;
    }



}

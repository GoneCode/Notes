package Polymorphism.MethodOverriding;

public class ClassB extends ClassA{
    @Override
    public int methodOverridingEx(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(new ClassB().methodOverridingEx(1,100));
        ClassA n = new ClassA();
        //System.out.println(n.methodOverrideStatic(100,200));
        //ClassA.methodOverrideStatic(1,2);
    }




}

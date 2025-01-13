package Inheritance.SingleInheritance;

public class ClassB extends ClassA{
    void sleep(){
        System.out.println("Sleep");
        super.work();
    }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.sleep();
        b.work();

    }
}

package javaOOPSConcepts.Abstraction.AbstractClasses;

public class AbstractClassDemo {

    // 1.) we achieve abstraction using abstract class
    // 2.) abstract class is used when few functionalities common across all the subclasses
    // 3.) using abstract class we can achieve code re-usability
    // 4.)

    // if the class is declared abstract then only the class can have abstract methods or else
    // it will throw compile time error.

    public static void main(String[] args) {
        Bank hdfc = new HDFC();
        hdfc.deposit();
        hdfc.withdraw();
        hdfc.calculateInterest();

        Bank icic = new ICIC();
        icic.deposit();
        icic.withdraw();
        icic.calculateInterest();
    }

}

    abstract class Bank{

    private int amount = 10;
    // concrete methods
        public void deposit(){
            System.out.println("Common deposit method implmentation across all banks");
        }

        public void withdraw(){
            System.out.println("Common withdraw method implmentation acorss all banks");
        }

        // abstract methods
        public abstract int calculateInterest();
    }

    class HDFC extends Bank{

        @Override
        public int calculateInterest() {
            System.out.println("HDFC BANK calculate interest implementation");
            return 0;
        }
    }

    class ICIC extends Bank{
        @Override
        public int calculateInterest() {
            System.out.println("ICIC BANK calculate interest implementation");
            return 0;
        }
    }


package javaOOPSConcepts.Abstraction.interfaceExample;

public class InterfaceDemo {

    public static void main(String[] args) {

        javaOOPSConcepts.Abstraction.interfaceExample.BankInterface hdfc = new HDFC();
        hdfc.deposit();
        hdfc.withdraw();
        hdfc.calculateInterest();
    }
}

    class HDFC implements javaOOPSConcepts.Abstraction.interfaceExample.BankInterface {

        @Override
        public void deposit() {
            System.out.println("HDFC BANK DEPOSIT IMPLEMENTATION");
        }

        @Override
        public void withdraw() {
            System.out.println("HDFC BANK WITHDRAW IMPLEMENTATION");

        }

        @Override
        public void calculateInterest() {
            System.out.println("HDFC BANK INTEREST CALCULATION");

        }
    }

    class ICIC implements javaOOPSConcepts.Abstraction.interfaceExample.BankInterface {

        @Override
        public void deposit() {
            System.out.println("ICIC BANK DEPOSIT IMPLEMENTATION");
        }

        @Override
        public void withdraw() {
            System.out.println("ICIC BANK WITHDRAW IMPLEMENTATION");
        }

        @Override
        public void calculateInterest() {
            System.out.println("ICIC BANK INTEREST CALCULATION");
        }
    }

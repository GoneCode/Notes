package TOPIC_1.javaOOPSConcepts.Abstraction.interfaceExample;

public interface BankInterface {


    // bydefault it is public abstract

    // interface are used to standardize a behaviour for a class
    //
    void deposit();
    public abstract void withdraw();
    public abstract void calculateInterest();
}

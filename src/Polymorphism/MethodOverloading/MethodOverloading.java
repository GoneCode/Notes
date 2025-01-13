package Polymorphism.MethodOverloading;

public class MethodOverloading  {

    public int add(int a,int b){
        return a+b;
    }

    public long add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {

        MethodOverloading m = new MethodOverloading();
        System.out.println(m.add(1,2,3));
        System.out.println(m.add(1,2));
    }



}

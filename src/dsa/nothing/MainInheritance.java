package dsa.nothing;

public class MainInheritance {

    public  static void main(String args[]){

        A a1 = new A();
        A a2 = new B();

//        B b1 = new A();
        B b2 = new B();


        a1.display();
        a2.display();
//        b1.display();
        b2.display();

    }
}

class A{
    void display(){
        System.out.println("A");
    }
}

class B extends A{
    void display(){
        System.out.println("B");
    }
}

package practicejava;

class Parent {
    final void m1() {   // final method - cannot be overridden
        System.out.println("Yes this is parent class");
    }
}

class Child extends Parent {
    void m1()   // ❌ Compile-time error: Cannot override the final method from Parent so we have to remove or change the method name of inherted class
    {
        System.out.println("this is child class");
    }
}

public class FinalMethod {
    public static void main(String[] args) {

    }
}
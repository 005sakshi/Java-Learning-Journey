package practicejava;

final class Test1 {  // final class - cannot be extended
    void m1(int a) {
        System.out.println("here is first class: " + a);
    }
}

class Test2 extends Test1 {  // ❌ Compile-time error here to stop this erro we have to remove the final keyword from the Class Test1
    void m1(int a) {
        System.out.println("This is my method.");
    }
}

class Practice {
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.m1(5);
    }
}
package practicejava;

class Test {
    final int x = 100;  // final variable - value cannot be changed once assigned
}

public class FinalKeyword {

    public static void main(String[] args) {

        Test obj = new Test();
        obj.x = 200;  // ❌ Compile-time error: cannot assign a value to final variable x so to work fine remove this 
        System.out.println(obj.x);

    }

}
class A {
    void show() {
        System.out.println("Show in A");
    }
}

class B extends A {
    void show() {
        super.show();
        System.out.println("Show in B");
    }
}

public class Main4 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

output: Show in A
Show in B

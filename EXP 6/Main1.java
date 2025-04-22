class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println("Child x: " + this.x);       // refers to child x
        System.out.println("Parent x: " + super.x);     // refers to parent x
    }
}

public class Main1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
output: Child x: 20
Parent x: 10

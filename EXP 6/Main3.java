class Car {
    void start() {
        System.out.println("Car is starting...");
    }
}

class Bike extends Car {
    void start() {
        System.out.println("Bike is starting...");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
    }
}
 output: Bike is starting...

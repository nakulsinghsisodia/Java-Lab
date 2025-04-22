class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

output: Animal makes sound
Dog barks

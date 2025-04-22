interface Animal {
    void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
    }
}


output: Cat meows


package interfac;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Pity");
        Animal cat = new Cat("Seth");

        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();
    }
}

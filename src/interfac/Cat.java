package interfac;

public class Cat implements Animal {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " está comendo");

    }

    @Override
    public void makeSound() {
        System.out.println(name + " diz: Miauuuuuu!!");

    }
}

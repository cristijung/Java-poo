package interfac;

public class Dog implements Animal {
    private final String NAME;

    public Dog(String NAME) {
        this.NAME = NAME;
    }


    @Override
    public void eat() {
        System.out.println(NAME + " já comeu!");

    }

    @Override
    public void makeSound() {
        System.out.println(NAME + " diz: au au au au!!");

    }
}

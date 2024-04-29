abstract class AnimalClass {
    protected String name;
    protected String sound;

    public abstract void makeSound();
}

class Cat extends AnimalClass {
    public Cat(String name) {
        this.name = name;
        this.sound = "Meow";
    }

    public void makeSound() {
        System.out.println(name + " says " + sound);
    }
}

class Dog extends AnimalClass {
    public Dog(String name) {
        this.name = name;
        this.sound = "Woof";
    }

    public void makeSound() {
        System.out.println(name + " says " + sound);
    }
}

public class Source {
    public static void main(String[] args) {
        AnimalClass cat = new Cat("Whiskers");
        AnimalClass dog = new Dog("Buddy");

        cat.makeSound();
        dog.makeSound();
    }
}

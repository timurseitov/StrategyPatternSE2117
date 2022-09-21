public class Animal {
    AnimalBehavior animalBehavior;
    FlyBehavior flyBehavior;

    public void fly() {
        flyBehavior.fly();
    }

    public void makeSound() {
        animalBehavior.makeSound();
    }

    public void eat() {
        System.out.println("eating...");
    }
}

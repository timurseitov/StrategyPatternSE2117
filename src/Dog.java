public class Dog extends Animal {

    public Dog() {
        this.animalBehavior = new DogBehavior();
        this.flyBehavior = new NoFly();
    }
}

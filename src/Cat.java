public class Cat extends Animal {

    public Cat() {
        this.animalBehavior = new CatBehavior();
        this.flyBehavior = new NoFly();
    }
}

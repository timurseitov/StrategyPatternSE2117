public class Duck extends Animal {

    public Duck () {
        this.animalBehavior = new DuckBehavior();
        this.flyBehavior = new DuckBehavior();
    }
}

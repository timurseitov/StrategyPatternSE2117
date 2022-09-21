public class Bird extends Animal {

    public Bird () {
        this.animalBehavior = new BirdBehavior();
        this.flyBehavior = new Fly();
    }


}

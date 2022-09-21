public class BirdBehavior implements FlyBehavior, AnimalBehavior {

    @Override
    public void makeSound() {
        System.out.println("Chick-Chirick!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying exactly like a bird");
    }
}

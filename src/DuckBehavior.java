public class DuckBehavior implements AnimalBehavior, FlyBehavior {

    @Override
    public void makeSound() {
        System.out.println("Quack-quack");
    }

    @Override
    public void fly() {
        System.out.println("I am Duck and I am flying like a duck");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("which animal do you want? press ");
        System.out.println("1 if dog");
        System.out.println("2 if bird");
        System.out.println("3 if duck");
        System.out.println("4 if cat");
        int num = scanner.nextInt();


        if (num == 1) {
            Animal dog = new Dog();
            System.out.println("You chose a dog:  ");
            System.out.print("Dog says: ");
            dog.makeSound();
            dog.fly();    //Проверка на полет собаки:
        } else if (num == 2) {
            Animal bird = new Bird();
            System.out.println("You chose a Bird:  ");
            System.out.print("bird says: ");
            bird.makeSound();
            bird.fly();     //Летать именно как птица(то есть своя реализация полета птицы)
        } else if (num == 3) {
            Animal duck = new Duck();
            System.out.println("You chose a Duck:  ");
            System.out.print("duck says: ");
            duck.makeSound();
            duck.fly();        //Летать именно как утка
        } else if (num == 4){
            Animal cat = new Cat();
            System.out.println("You chose a cat: ");
            System.out.print("cat says: ");
            cat.makeSound();
            cat.fly();    //Проверка на полет кошки
        } else {
            System.out.println("Please, choose 1 to 4!");
        }







    }
}

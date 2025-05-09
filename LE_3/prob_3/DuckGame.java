
public class DuckGame {
    public static void main(String[] args) {
        Duck[] ducks = {new RubberDuck(), new WoodenDuck(), new RedHeadDuck(), new LakeDuck()};

        for (Duck duck : ducks) {
            System.out.println("\n" + duck.getClass().getSimpleName() + ":");
            duck.swim();
            
            // Checking if the duck can fly
            if (duck instanceof Flyable) {
                ((Flyable) duck).fly();
            }

            // Checking if the duck can quack
            if (duck instanceof Quackable) {
                ((Quackable) duck).quack();
            }
        }
    }
}
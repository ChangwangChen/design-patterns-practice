public class NormalDuck extends Duck
{
    public NormalDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I an a normal duck!");
    }
}
public class ModelDuck extends Duck
{
    public ModelDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }

    public void display()
    {
        System.out.println("I'm a Model Duck!'");
    }
}
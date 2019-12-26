public class ModelDuck extends Duck
{
    public ModelDuck()
    {
        flyBehavior = new CanNotFly();
        quackBehavior = new MuteQuack();
    }

    public void display()
    {
        System.out.println("I'm a Model Duck!'");
    }
}
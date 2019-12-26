public class MiniDuckSimulator
{
    public static void main(String args[])
    {
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        Duck normalDuck = new NormalDuck();
        normalDuck.display();
        normalDuck.performFly();
        normalDuck.performQuack();
    }
}

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flybehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Hi, I'm a real Mallard duck");
    }
}

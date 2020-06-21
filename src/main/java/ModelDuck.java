public class ModelDuck extends Duck {
    public ModelDuck(){
        flybehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Hello! I'm a model duck");
    }
}

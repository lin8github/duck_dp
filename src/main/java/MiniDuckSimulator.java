public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlybehavior(new FlyRocketPowered());
        model.performFly();
    }
}

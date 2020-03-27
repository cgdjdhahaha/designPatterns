package designPatterns.strategy.DuckDemo;

public class test {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.disPlay();
        duck.swim();
        System.out.println("-------------------");
        duck.performFly();
        duck.performQuack();
        System.out.println("-------------------");

        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new GaGaQuack());
        duck.performFly();
        duck.performQuack();
    }
}

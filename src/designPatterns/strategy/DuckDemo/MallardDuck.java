package designPatterns.strategy.DuckDemo;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithoutWings();
        quackBehavior = new ZhiZhiQuack();
    }

    @Override
    public void disPlay() {
        System.out.println("my color is green.");
    }
}

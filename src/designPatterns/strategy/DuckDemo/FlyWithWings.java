package designPatterns.strategy.DuckDemo;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void flying() {
        System.out.println("i can fly by wings. hahaha...");
    }
}

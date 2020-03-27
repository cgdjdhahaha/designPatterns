package designPatterns.strategy.DuckDemo;

public class FlyWithoutWings implements FlyBehavior {
    @Override
    public void flying() {
        System.out.println("i can't fly...");
    }
}

package designPatterns.strategy.DuckDemo;

public class GaGaQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("gagagagagaga...");
    }
}

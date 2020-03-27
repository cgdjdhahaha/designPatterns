package designPatterns.strategy.DuckDemo;

public class ZhiZhiQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("zhizhizhizhi...");
    }
}

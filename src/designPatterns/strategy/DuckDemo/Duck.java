package designPatterns.strategy.DuckDemo;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void disPlay();

    public void swim(){
        System.out.println("i'm swimming!!!");
    }

    public void performFly(){
        flyBehavior.flying();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
}

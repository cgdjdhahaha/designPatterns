package designPatterns.strategy;

public class Dog implements Comparable<Dog> {
    private int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Dog dog) {
        return Integer.compare(this.food, dog.food);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}

package designPatterns.singleton;

public class Test2 {
    private Test2() {
    }

    public static class Holder {
        private static Test2 INSTANCE = new Test2();
    }

    public static Test2 getInstance() {
        return Holder.INSTANCE;
    }
}

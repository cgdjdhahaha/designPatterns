package designPatterns.singleton;

import java.util.ArrayList;

public class Test1 {
    private static Test1 INSTSNCE;
    private Test1(){}
    public static Test1 getInstance(){
        if(INSTSNCE == null){
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            INSTSNCE = new Test1();
        }
        return INSTSNCE;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int j = 0;
        for (int i = 0;i<100;i++) {
            new Thread(() -> {
                int num = getInstance().hashCode();
                if ( !arrayList.contains(num)){
                    arrayList.add(j,num);
                }
                System.out.println(num);
            }).start();
        }
        System.out.println(arrayList.size());
    }
}

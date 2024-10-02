package src.com.tony;

public class App implements Runnable{
    public static void main(String[] args) {
        System.out.println("hello");
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
                System.out.println("thread -sleep -1");
                System.out.println("sdfiew");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

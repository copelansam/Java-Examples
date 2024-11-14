import java.util.Random;

public class Baby implements Runnable{
    private int time;
    private String name;

    Baby(String name){
        this.name = name;
        Random rand = new Random();
        time = rand.nextInt(5000);
    }
    public void run() {
        try {
            System.out.println("My name is " + name + " I am going to sleep for " + time + "ms");
            Thread.sleep(time);
            System.out.println("My name is " + name + ", I am awake, feed me!!!");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

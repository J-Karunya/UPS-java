class A extends Thread {
    public void run() {
        try {
            //System.out.println("Task A");
            sleep(2000); // Pause A for 2 seconds
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Task A");
        
    }
}
class B extends Thread {
    public void run() {
        System.out.println("Task B");
    }
}
public class threads {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        t1.start();
        t2.start();
    }
}
/*Cannot call same thread twice */
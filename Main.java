
class Classroom {
    synchronized void student() {
        try {
            System.out.println("Student is waiting...");

            wait();

            System.out.println("Student can start learning!");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    synchronized void teacher() {
        System.out.println("Teacher: Class begins!");
        notify();
    }
}

public class Main {
    public static void main(String[] args)
            throws InterruptedException {

        Classroom room = new Classroom();

        Thread student = new Thread(() -> room.student());
        Thread teacher = new Thread(() -> room.teacher());

        student.start();

        Thread.sleep(500); // Give student time to wait
        teacher.start();
    }
}

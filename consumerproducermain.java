class SharedData {
    int number;
    boolean available = false;
    synchronized void put(int n) throws InterruptedException {
        while (available) {
            wait();
        }
        number = n;
        available = true;
        System.out.println("Produced: " + n);
        notifyAll();
    }
    synchronized int take() throws InterruptedException {
        while (!available) {
            wait();
        }
        int n = number;
        available = false;

        notifyAll();
        return n;
    }
}
class Producer extends Thread {
    SharedData data;
    Producer(SharedData data) {
        this.data = data;
    }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                data.put(i);
            }
            data.put(-1); // Signal that production is finished
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
class Consumer extends Thread {
    SharedData data;
    Consumer(SharedData data) {
        this.data = data;
    }
    public void run() {
        try {
            while (true) {
                int n = data.take();
                if (n == -1) {
                    break;
                }
                System.out.println("Consumed: " + n);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
class consumerproducermain {
    public static void main(String[] args)
        throws InterruptedException {
        SharedData data = new SharedData();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        p.start();
        c.start();
        p.join();
        c.join();
        System.out.println("Both threads finished.");
    }
}

class ticketcounter{
    int tickets=10;
    synchronized void booktickets(String name,int requested){
        if (requested<=tickets){
            System.out.println(name+"booked"+requested+"tickets");
            tickets-=requested;
            System.out.println("Tickets remaining: " + tickets);
        } else {
            System.out.println(name+" booking failed. Only "+tickets+ " tickets available.");
        }
    }
}
class customer extends Thread{
    ticketcounter counter;
    String customername;
    customer(ticketcounter counter, String customername) {
        this.counter = counter;
        this.customername = customername;
    }
    public void run() {
        counter.booktickets(customername, 4);
    }

}
class ticketcountermain{
    public static void main(String[] args) {
        ticketcounter counter = new ticketcounter();
        customer c1 = new customer(counter, "Customer 1");
        customer c2 = new customer(counter, "Customer 2");
        customer c3 = new customer(counter, "Customer 3");
        c1.start();
        c2.start();
        c3.start();
    }
}
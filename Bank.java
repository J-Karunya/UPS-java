import java.util.Scanner;
class minibank{
    private String acc;
    private double balance;

    //setter for acc name:
    public void setAcc(String acc){
        this.acc=acc;
    }

    //getter for acc name:
    public String getacc(){
        return acc;
    }

    //getter for balance...cannot set balance
    public double getbalance(){
        return balance;
    }

    //deposit function:
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Amount deposited successfully!");
        }
        else{
            System.out.println("Invalid deposit amount!");
        }
    }

    //withdraw function:
    public void withdraw(double amount){
        if (amount<= balance){
            balance-=amount;
            System.out.println("Withdrawal successful!");
        }
        else if (amount<0){
            System.out.println("Invalid amount!");
        }
        else{
            System.out.println("Insufficient balance!");
        }
    }
}
public class Bank{
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);
        minibank b=new minibank();
        System.out.println("Enter account number:");
        String acc=sc.nextLine();
        b.setAcc(acc);
        int choice;
        do{
            System.out.println("Welcome!");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check balance");
            System.out.println("4.Account details");
            System.out.println("5.exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice==1){
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                b.deposit(amount);
            }
            else if (choice==2){
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();
                b.withdraw(amount);
            }
            else if (choice==3){
                System.out.println("Balance Rs."+b.getbalance());
            }
            else if(choice==4){
                System.out.println("Account Name:"+b.getacc());
                System.out.println("Balance Rs."+b.getbalance());
            }
            else{
                System.out.println("Invalid Choice");
            }

        }while(choice!=5);
        sc.close();
    }
}
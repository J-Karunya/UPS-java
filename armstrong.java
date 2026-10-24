import java.util.Scanner;
class armstrong{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int original=n;
        int sum=0;
        int digits=String.valueOf(n).length();
        while (n>0){
            int rem=n%10;
            sum+=Math.pow(rem, digits);
            n=n/10;
        }
        if (original==sum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
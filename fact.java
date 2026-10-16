import java.util.Scanner;
class fact{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        long prod=1L;
        if (n<0){
            System.out.println("No negative input");
        }
        else if (n==0 || n==1){
            System.out.println(1);
        }
        else{
            for (int i=2;i<=n;i++){
                prod*=i;
        }
            System.out.println(prod);
        }
        
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

class zerodivcatch{
    public static void main(String []ar){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter first number:");
            int a=sc.nextInt();
            System.out.print("Enter Second number:");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println(a+"/"+b+"="+c);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }
        catch (InputMismatchException e){
            System.out.println("Incorrect Input!");
        }
        finally{
            System.out.println("Program execution completed!");
        }
    }
}
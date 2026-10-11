import java.util.Scanner;
class calci{
    public static void cal(){
        System.out.println("Operations:"+"\n"+"1. + for Addition"+"\n"+"2. - for Subtraction"+"\n"+"3. * for Multiplication"+"\n"+"5. / for Division"+"\n"+"4. q for quit");
        while(true){
            Scanner scint=new Scanner(System.in);
            System.out.println("Enter a:");
            int a=scint.nextInt();
            System.out.println("Enter b:");
            int b=scint.nextInt();
            Scanner scstr=new Scanner(System.in);
            System.out.println("Enter Operation:");
            String op=scstr.nextLine();
            if (op.equals("+")){
                System.out.println(a+b);
            }
            else if (op.equals("-")){
                System.out.println(a-b);
            }
            else if (op.equals("/")){
                System.out.println(a/b);
            }
            else if (op.equals("*")){
                System.out.println(a*b);
            }
            else if (op.equals("q")){
                break;
            }
            else{
                System.out.println("Invalid operation");
            }
        }
    }
    public static void main(String []a){
            cal();
    }
}
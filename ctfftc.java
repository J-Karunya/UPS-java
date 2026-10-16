import java.util.Scanner;
class ctfftc{
    public static void ctf(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Celcius: ");
        float cl=sc.nextFloat();
        System.out.println("Fahrenheit: "+((cl*(9.0f/5))+32));

    }
    public static void ftc(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        float fh=sc.nextFloat();
        System.out.println("Celcius: "+((fh-32)*(5.0f/9)));

    }
    public static void main(String a[]){
        ctf();
        ftc();
    }
}
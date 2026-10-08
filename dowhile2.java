import java.util.Scanner;
class dowhile2{
	public static void main(String []a){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int prod=1;
		int i=1;
		do{
			prod*=i;
			i+=1;
		} while(i<=num);
		System.out.println(prod);
		}
}
import java.util.Scanner;
class dowhile1{
	public static void main(String []a){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int count=0;
		do{
			n/=10;
			count+=1;
		}while(n>0);
		System.out.println("NO. of digits:"+ count);
		}
}
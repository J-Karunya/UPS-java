import java.util.Scanner;
class dowhile{
	public static void main(String []a){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int sum=0;
		int i=0;
		do{
			sum+=i;
			i+=1;
		} while(i<=num);
		System.out.println(sum);
		}
}
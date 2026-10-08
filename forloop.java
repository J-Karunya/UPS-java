import java.util.Scanner;
class forloop{
	public static void main(String []a){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		for (int i=1;i<=10;i++){
			System.out.println(n+"*"+i+"="+(i*n));
		}
		}
}
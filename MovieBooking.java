import java.util.*;
class MovieBooking{
	public static void main(String []a){
		System.out.print("**********************************************");
		System.out.print("Movie Booking System");
		System.out.println("**********************************************");
		System.out.println("Currently available movies:");
		String[] Movies={"1.Movie 1","2.Movie 2","3.Movie 3","4.Movie 4","5.Movie 5"};
		for (int i=0;i<5;i++){
			System.out.print("              ");
			System.out.println(Movies[i]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Movie number:");
		int Movie=sc.nextInt();

		switch(Movie){
		case 1:
		{
			System.out.println("Available Screens: 2, 3, 5");
			System.out.print("Enter Screen Number:");
			int num=sc.nextInt();
			System.out.println("Successful...");
			break;
			
		}
		case 2:
		{
			System.out.println("Available Screens: 3, 5");
			System.out.print("Enter Screen Number:");
			int num=sc.nextInt();
			System.out.println("Successful...");
			break;
		}
		case 3:
		{       
			System.out.println("Available Screens: 1, 4, 7");
			System.out.print("Enter Screen Number:");
			int num=sc.nextInt();
			System.out.println("Successful...");
			break;
		}
		case 4:
		{
			System.out.println("Available Screens: 6, 8");
			System.out.print("Enter Screen Number:");
			int num=sc.nextInt();
			System.out.println("Successful...");
			break;
		}
		case 5:
		{
			System.out.println("Available Screens: 8, 9");
			System.out.print("Enter Screen Number:");
			int num=sc.nextInt();
			System.out.println("Successful...");
			break;
		}
		default:
		{
			System.out.println("Sorry, that movie is not available at the moment");
			System.out.print("Please try again");
		}

		}

		
	}
}

import java.util.Scanner;
class InvalidPhoneNumber extends Exception{
    public InvalidPhoneNumber (String message){
        super(message);
    }
}
class userdefex{
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Phone number:");
        String ph=sc.nextLine();
        try{
            if(!ph.matches("[0-9]+")){
                throw new InvalidPhoneNumber("Phone number must contain only digits!");
            }
            if(ph.length()!=10){
                throw new InvalidPhoneNumber("Phone number must contain exactly 10 digits!");
            }
            System.out.println("Valid phone number");
        }
        catch(InvalidPhoneNumber e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

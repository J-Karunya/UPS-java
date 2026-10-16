import java.util.Scanner;
class palin{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String st=sc.nextLine();
        int n=st.length();
        boolean res=true;
        for (int i=0;i<n/2;i++){
            if (st.charAt(i)!=st.charAt(n-i-1)){
                res=false;
                break;
            }
        }
        if (res==true){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }
}
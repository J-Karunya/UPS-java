import java.util.Scanner;
class revstr{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String st=sc.nextLine();
        int n=st.length();
        String rev="";
        for (int i=n-1;i>=0;i--){
            rev+=st.charAt(i);
        }
        System.out.print(rev);
    }
}
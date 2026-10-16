import java.util.Scanner;
class vowcount{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String st=sc.nextLine();
        int c=0;
        for (char ch:st.toCharArray()){
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                c+=1;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
import java.util.Scanner;
class vowwith{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sequence:");
        String seq=sc.nextLine().trim();
        StringBuilder s=new StringBuilder();
        for (char ch:seq.toCharArray()){
            if(ch==' '){
                s.append(' ');
            }
            else if (Character.toLowerCase(ch)=='a' || Character.toLowerCase(ch)=='e' || Character.toLowerCase(ch)=='i' || Character.toLowerCase(ch)=='o' || Character.toLowerCase(ch)=='u'){
                s.append('*');
            }
            else{
                s.append(ch);
            }
        }
        System.out.println(s.toString());
    }
}
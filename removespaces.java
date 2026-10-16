import java.util.Scanner;
class removespaces{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sequence:");
        String[] seq=sc.nextLine().trim().split("\\s+"); //seq = seq.replaceAll("\\s+", "");
        StringBuilder s=new StringBuilder();
        for (String w:seq){
            s.append(w);
        }
        System.out.println(s.toString());
    }
}
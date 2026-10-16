import java.util.Scanner;
class numwordsseq{
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sequence");
        String input=sc.nextLine().trim();
        String[] arr= input.split("\\s+");
        System.out.println(arr.length);
    }
}
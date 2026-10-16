import java.util.Arrays;
import java.util.Scanner;
class anagrams{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter word 1:");
        char[] w1=sc.nextLine().toLowerCase().toCharArray();
        System.out.print("Enter word 2:");
        char[] w2=sc.nextLine().toLowerCase().toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        if (Arrays.equals(w1,w2)){
            System.out.println("They are anagrams");
        }
        else{
            System.out.println("They are not anagrams");
        }
        sc.close();
    }

}
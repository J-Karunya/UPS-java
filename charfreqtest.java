import java.util.HashMap;
import java.util.Scanner;

class charfreqtest{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sequence:");
        String seq=sc.nextLine().trim();
        HashMap<Character, Integer> freq=new HashMap<>();
        for (char ch:seq.toLowerCase().toCharArray()){
            if (ch==' '){
                continue;
            }
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        System.out.println(freq);
    }
}
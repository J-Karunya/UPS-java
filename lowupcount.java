import java.util.Scanner;
class lowupcount{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sequence:");
        String seq=sc.nextLine();
        int uc=0;
        int lc=0;
        for (char ch:seq.toCharArray()){
            if (Character.toUpperCase(ch)==ch){
                uc++;
            }
            else if(Character.toLowerCase(ch)==ch){
                lc++;
            }
        }
        System.out.println("Uppercase letters: "+uc);
        System.out.println("Lowercase letters: "+lc);
    }
}
import java.util.Scanner;
class firstnonrep{
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String seq=sc.nextLine();
        char[] word=seq.toCharArray();
        int n=word.length;
        for (int i=0;i<n;i++){
            boolean found=false;
            for (int j=0;j<i;j++){
                if (word[i]==word[j]){
                    found=true;
                    break;
                }
            }
            if (found){
                continue;
            }
            boolean repeat=false;
            for (int k=i+1;k<n;k++){
                if (word[i]==word[k]){
                    repeat=true;
                    break;
                }
            }
            if (!repeat){
                System.out.print(word[i]+" ");
                break;
            }
        }
        sc.close();
    }
}
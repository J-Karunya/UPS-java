import java.util.Scanner;
class upcasewords{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sequence:");
        String seq=sc.nextLine().trim();
        String[] arr=seq.split("\\s+");
        StringBuilder s=new StringBuilder();
        int n=arr.length;
        for (int i=0;i<n;i++){
            String word=arr[i];
            String updated=word.substring(0,1).toUpperCase()+word.substring(1);
            s.append(updated);
            if (i<n-1){
                s.append(" ");
            }
        }
        System.out.println(s.toString());
        sc.close();
        
    }
}
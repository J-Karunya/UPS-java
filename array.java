import java.util.Scanner;
class array{
    public static int sum(int[] arr){
        int n=arr.length;
        int s=0;
        for (int i=0;i<n;i++){
            if (arr[i]%2==0){
                s+=arr[i];
            }
        }
        return s;

    }
    public static void  main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter element "+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr));
        
    }
}
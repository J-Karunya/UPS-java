import java.util.Scanner;
class asc{
    public static int[] asc(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
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
        asc(arr);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
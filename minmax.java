import java.util.Scanner;
class minmax{
    public static void minmax(int[] arr){
        int mi=Integer.MAX_VALUE;
        int smi=Integer.MAX_VALUE;
        int ma=Integer.MIN_VALUE;
        int sma=Integer.MIN_VALUE;
        int n=arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]<mi){
                smi=mi;
                mi=arr[i];
            }
            else if(arr[i]>mi && arr[i]<smi){
                smi=arr[i];
            }
            if (arr[i]>ma){
                sma=ma;
                ma=arr[i];
            }
            else if(arr[i]<ma && arr[i]>sma){
                sma=arr[i];
            }          
        }
        System.out.println("Maximum Element:"+ma);
        System.out.println("Second Maximum Element:"+sma);
        System.out.println("Minimum Element:"+mi);
        System.out.println("Second Minimum Element:"+smi);
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
        minmax(arr);
    }
}
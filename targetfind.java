import java.util.Scanner;
class targetfind{
    public static int find(int[] arr,int target){
        int n=arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter target:");
        int target=sc.nextInt();
        int res=find(arr,target);
        if (res!=-1){
            System.out.println("Is at index: "+res);
        }
        else{
            System.out.println("Not found");
        }
        
    }

}
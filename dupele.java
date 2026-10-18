import java.util.Scanner;
class dupele{
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter element "+(i+1));
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            boolean found=false;
            for (int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    found=true;
                    break;
                }
            }
            if (found){
                continue;
            }

            for (int k=i+1;k<n;k++){
                if (arr[i]==arr[k]){
                    System.out.print(arr[k]+" ");
                    break;
                }
            }
        }
        sc.close();
    }
}
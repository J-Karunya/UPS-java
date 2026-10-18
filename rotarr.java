import java.util.Scanner;
class rotarr{
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter element "+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter number of rotation: ");
        int r=sc.nextInt();
        r=r%n;
        int[] neww=new int[n];
        for (int i=0;i<n;i++){
            neww[(i+r)%n]=arr[i];
        }
        System.out.println("Rotated array:");
        for (int i=0;i<n;i++){
            System.out.print(neww[i]+" ");
        }
    }
}
import java.util.Scanner;
public class assignment4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of test cases :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>0 && arr[j]<0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("array is "+arr[i]);
        }
        sc.close();
    }
}

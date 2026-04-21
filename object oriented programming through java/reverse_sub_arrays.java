import java.util.*;
import java.lang.*;
public class program1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        int count1=0;
        for(int i=0;i<6;i=i+n){
            int l=1;
            int k=i+n-1;
            count=1;
            count1=k;
            while(l<k && k<6){
                int temp1=arr[l];
                arr[l]=arr[k];
                arr[k]=temp1;
                l++;
                k--;
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}

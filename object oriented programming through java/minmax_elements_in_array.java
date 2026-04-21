import java.util.*;
class MinMaxDiff
{
    void MinMaxDiff(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        int m=a[0];
        int n=a[a.length-1];
        int o=n-m;
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                c=1;
            }
        }
        if(c==1){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
    //Use MinMaxDiff(...) method, to perform required logic and print it.
}
class Test {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        MinMaxDiff md=new MinMaxDiff();
        md.MinMaxDiff(arr);
    }
}

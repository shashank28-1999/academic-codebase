import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int l[]=new int[n];
        int r[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            l[i]=l[i-1]+a[i-1];
            r[n-i-1]=r[n-i]+a[n-i];
        }
        for(int i=0;i<n;i++){
            System.out.print((l[i]+r[i])+" ");
        }
    }
}

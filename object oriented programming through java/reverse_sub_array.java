import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int x=n%m,k,y=0,i;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i=i+m){
            k=1;
            for(int j=i;j<m+i && j<n-x;j++){
                b[j]=a[m+i-k];
                k++;
            }
        }
        for(i=i-m;i<n;i++){
            b[i]=a[i];
        }
        for(i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}

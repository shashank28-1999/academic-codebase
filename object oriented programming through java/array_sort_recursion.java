import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sort(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void sort(int a[],int i,int j){
        if(i>=j){
            return;
        }
        if(a[i]==0){
            sort(a,i+1,j);
        }
        if(a[j]==1){
            sort(a,i,j-1);
        }
        if(a[i]==1 && a[j]==0){
            a[i]=0;
            a[j]=1;
            sort(a,i+1,j-1);
        }
    }
}

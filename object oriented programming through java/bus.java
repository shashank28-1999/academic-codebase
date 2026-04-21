import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int m=sc.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        int w[]=new int[n];
        for(int i=0;i<n;i++){
            w[i]=fill(a,i);
        }
        for(int i=0;i<n;i++){
            if(w[i]>0){
                c++;
            }
        }
        System.out.println(c);
    }
    public static int fill(int a[],int x){
        int c=0;
        if((x+1)%7==0 || (x+1)%7==6){
            return 0;
        }
        for(int i=0;i<a.length;i++){
            if(((x+1)%a[i])==0){
                c++;
            }
        }
        return c;
    }
}

import java.util.*;
class program1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String x="";
        String y="";
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int c[]=new int[100];
        for(int i=0;i<a.length;i++){
            c[i]=c[i]+a[i];
        }
        for(int i=0;i<b.length;i++){
            c[i]=c[i]+b[i];
        }
        for(int i=0;i<c.length;i++){
            x=x+c[i];
        }
        for(int i=0;i<x.length();i++){
            y=y+x.charAt(i)+" ";
        }
        System.out.println(y);
    }
}

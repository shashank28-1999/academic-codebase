import java.util.*;
class prog{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        char b[]=s.toCharArray();
        char a[][]=new char[n][n];
        int k=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j%2==0){
                    a[i][j]=b[i];
                }
                else{
                    a[i][j]=b[k];
                }
            }
            k--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n!=m || n%2==0){
            System.out.println("-1");
            return;
        }
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==n/2 || j==n/2){
                    b[i][j]=a[j][i];
                }
                else{
                    b[i][j]=a[i][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}

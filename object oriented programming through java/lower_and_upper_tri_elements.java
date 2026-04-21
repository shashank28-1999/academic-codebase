import java.util.*;
class program1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=0,c=0;
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=j){
                    b=b+a[i][j];
                }
                if(i>=j){
                    c=c+a[i][j];
                }
            }
        }
        System.out.println(c);
        System.out.println(b);
    }
}

import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=(n-i)*2-1;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            System.out.print(i);
        }
        for(int i=n-1;i>=1;i--){
            System.out.print(i);
        }
        System.out.println();
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=(n-i)*2-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

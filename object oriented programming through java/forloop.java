/* Pattern printing using nested for loops */
import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=n;i>0;i--){
            for(j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(i=2;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

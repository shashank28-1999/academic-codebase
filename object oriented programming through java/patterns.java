import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<0){
            System.out.println(-1);
        }
        int sum=0;
        for(int i=1;i<=a;i++){
            int v=i;
            for(int j=1;j<=i;j++){
                System.out.print(v+" ");
                v=v+a-j;
            }
            System.out.println();
        }
    }
}

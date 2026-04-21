import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        int c=0;
        while(n>0){
            int a=n%10;
            n=n/10;
            x=x*10+a;
        }
        while(x>0){
            int a=x%10;
            x=x/10;
            printNumber(a);
        }
    }
    static void printNumber(int n){
        for(int i=0;i<n;i++){
            System.out.print(n);
        }
        System.out.println();
    }
}

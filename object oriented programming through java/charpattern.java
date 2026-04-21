import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("1*Z");
        char x='Y';
        for(int i=2;i<=n;i++){
            System.out.print(i);
            for(int j=2;j<=i;j++){
                System.out.print("*"+x);
            }
            System.out.print("*"+x+"*"+i);
            x--;
            System.out.println();
        }
    }
}

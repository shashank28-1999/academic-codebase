/* Factorial using recursion
Ex:
input = 5
output = 120.0
*/
import java.util.Scanner;
class Factorial{
    int f=1,i=1;
    int fact(int n){
        if(n==1){
            return 1;
        }
        else return n*fact(n-1);
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Factorial b=new Factorial();
        System.out.println(b.fact(a));
    }
}

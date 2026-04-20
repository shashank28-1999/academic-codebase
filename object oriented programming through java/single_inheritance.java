/* Single Inheritance - Calculation and MyCalculation
Parent: Calculation (addition, subtraction)
Child: MyCalculation (multiplication, calls parent methods)
*/
import java.util.*;
class Calculation{
    void addition(int a,int b){
        int c;
        c=a+b;
        System.out.println(c);
    }
    void subtraction(int a,int b){
        int c;
        c=a-b;
        System.out.println(c);
    }
}
class MyCalculation extends Calculation{
    void multiplication(int a,int b){
        int c;
        c=a*b;
        Calculation s=new Calculation();
        s.addition(a,b);
        s.subtraction(a,b);
        System.out.println(c);
    }
}
class Test{
    public static void main(String args[]){
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        MyCalculation d=new MyCalculation();
        d.multiplication(n,m);
    }
}

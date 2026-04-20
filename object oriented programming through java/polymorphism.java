/* Polymorphism - Method overriding with Bank, SBI, ICICI
Bank base class, SBI and ICICI override simpleInterest()
*/
import java.util.*;
class Bank{
    double i;
    double simpleInterest(int p,int t,double r){
        i=(p*t*r)/100;
        return i;
    }
}
class SBI extends Bank{
    double i;
    double simpleInterest(int p,int t,double r){
        i=(p*t*r)/100;
        return i;
    }
}
class ICICI extends Bank{
    float f;
    double simpleInterest(int p,int t,double r){
        i=(p*t*r)/100;
        return i;
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int t=sc.nextInt();
        Bank s;
        s=new SBI();
        System.out.println(s.simpleInterest(p,t,8.4));
        Bank i;
        i=new ICICI();
        System.out.println(s.simpleInterest(p,t,7.3));
    }
}

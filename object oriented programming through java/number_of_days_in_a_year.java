/* Convert number of days to Years, Months, Weeks and Days
Ex:
input = 1050 //no. of days
output =
Years = 2
Months = 10
Weeks = 2
Days = 6
*/
import java.util.*;
class Test{
    void conversion(int i){
        int a=i/365;
        i=i%365;
        int b=i/30;
        i=i%30;
        int c=i/7;
        i=i%7;
        System.out.println("Years ="+a);
        System.out.println("Months ="+b);
        System.out.println("Weeks ="+c);
        System.out.println("Days ="+i);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Test t=new Test();
        t.conversion(n);
    }
}

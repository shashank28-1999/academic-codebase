/* Employee details - calculate total salary (basicsal + DA + HRA)
DA = 10% of basicsal, HRA = 15% of basicsal
Ex input: eno ename basicsal
output: 12500
*/
import java.util.*;
class Employee{
    int eno;
    int basicsal,da,hra;
    String ename;
    Employee(int n,String en,int bs){
        eno=n;
        ename=en;
        basicsal=bs;
    }
    void calculateTotalSal(){
        da=(basicsal*10)/100;
        hra=(basicsal*15)/100;
        int total=basicsal+da+hra;
        System.out.println(total);
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=sc.next();
        int c=sc.nextInt();
        Employee e=new Employee(a,b,c);
        e.calculateTotalSal();
    }
}

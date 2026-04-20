/* Student details using static variable
Ex:
101 suresh KMIT
102 ramesh KMIT
*/
import java.util.*;
class Student{
    int rollno;
    String name;
    static String college="KMIT";
    void setValues(int r,String n){
        rollno=r;
        name=n;
    }
    void printValues(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        String n1=sc.next();
        int r2=sc.nextInt();
        String n2=sc.next();
        Student s1=new Student();
        s1.setValues(r1,n1);
        Student s2=new Student();
        s2.setValues(r2,n2);
        s1.printValues();
        s2.printValues();
    }
}

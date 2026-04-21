import java.util.*;
public class PriorityExample
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //add code according to the comments given below......

        // Creating Priority queue constructor a StudentComparator instance as its parameters

        System.out.println("enter noof students");

        int n=in.nextInt();
        Student stu;
        String name;
        double cgpa;
        PriorityQueue<Student> s1 = new PriorityQueue<Student>(n);
        System.out.println("enter name and cgpa of each student");
        for (int i = 0; i < n ; i++)
        {
            name = in.next();
            cgpa = in.nextDouble();
            Student s=new Student(name,cgpa);
            s1.add(s);
            //accept name and cgpa and create student object using name and cgpa values

            //add student object to priorityqueue object
        }

        System.out.println("Students priority order according to cgpa");
        for(int i=0;i<n;i++){
            Student q = s1.remove();
            System.out.println(q.name);
        }
        //print the student names using priorityqueue object

    }
}

class Student implements Comparable<Student> {

    public String name;
    public double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Student s2) {
        if(this.cgpa == s2.cgpa){
            return 0;
        }else if (this.cgpa>s2.cgpa){
            return -1;
        }else{
            return 1;
        }
        //add code here...to compare s1 cgpa and s2 cgpa
    }
}

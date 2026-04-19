#include<iostream>
#include<string.h>
using namespace std;
class Student
{
    private:
        char *a;
        int b,c,d;
        //declare required data members for student name, 3 subject marks & for gpa
    public:
        float gpa;
        Student(char *str,int m,int s,int e)
        {
            a=new char[strlen(str)+1];
            strcpy(a,str);
            b=m;
            c=s;
            d=e;
            //write code to assign the values of name & 3 subject marks to data members of class
        }
        void stu_gpa();
        void display();
        ~Student()
        {
            cout<<"destructor called"<<endl;
        }
};
void Student::stu_gpa(){
    gpa=(float)(b+c+d)/30;
}
//write functionality of stu_gpa() to calculate gpa of individual student marks

void Student::display(){
    cout<<a<<" "<<gpa<<endl;
}
//write code to print name & gpa in display() as in output

int main()
{
    int i;
    Student s1[3]={Student((char*)"ram",78,75,72),
    Student((char*)"sam",85,89,93),
    Student((char*)"gita",76,80,84)};
    //define array of objects & pass list of details as arguments to parameterized constructor
    for(i=0;i<3;i++){
        s1[i].stu_gpa();
        s1[i].display();
        //access stu_gpa() and display() using array of objects
    }
}

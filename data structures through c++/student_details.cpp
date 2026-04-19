#include<iostream>
#include<string.h>
using namespace std;

class Student
{
    private:
        float s1,s2,s3;
    public:
        int rollno,tot;
        char name[10];
        float avg,x;

        void getData()
        {
            cin>>rollno;
            cin>>name;
            cin>>s1>>s2>>s3;
            // read input required
        }
        void calculate()
        {
            tot=0;
            tot=s1+s2+s3;
            x=tot;
            avg=x/3.0;
            //perform calculation of total & avg
        }
        void output(){
            cout<<rollno<<" "<<name<<" "<<tot<<" "<<avg;
        }
};

int main()
{
    Student a;
    a.getData();
    //create an object for class
    //access methods getData and calculate with object
    a.calculate();
    a.output();
    //print the output(as specified in sample output)
    return 0;
}

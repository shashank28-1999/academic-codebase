#include<iostream>
using namespace std;
class Slope{
    float p1,p2;
    //declare require float variables
    public:
    Slope(){
    }
    Slope(float q1,float q2)
    {
        p1=q1;
        p2=q2;
    }
    //define parameterized constructor to access input values
    Slope operator-(Slope a){
        Slope b;
        b.p1=p1-a.p1;
        b.p2=p2-a.p2;
        return b;
    }
    //use operator (-) to calculate difference of values
    void display(){
        cout<<"slope of a straight line is "<<p2/p1<<endl;
    }
    //then use display() to calculate & print required result(as given in sample output)
};

int main()
{
    float l1,b1,l2,b2;
    cout<<"enter coordinates of starting point of straight line"<<endl;
    cin>>l1>>b1;
    //read input

    cout<<"enter coordinates of ending point of straight line"<<endl;
    cin>>l2>>b2;
    //read input
    Slope e;
    //pass values to class using parameterized constructor
    Slope c(l1,b1);
    Slope d(l2,b2);
    e=c-d;
    e.display();
    //access operator overloading(-) & display() function to calculate & print the slope of the straight line

    return 0;
}

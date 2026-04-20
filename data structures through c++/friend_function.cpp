#include<iostream>
using namespace std;
//write required code here
class B;
class A
{
    float a;
    public:
    A(float n){
        a=n;
    }
    //declare a first variable & access the value from main using parameterized constructor
    friend float mean(A,B);
    //use friend function to calculate mean
};
class B
{
    float a;
    public:
    B(float n){
        a=n;
    }
    //declare a second variable & access the value from main using parameterized constructor
    friend float mean(A,B);
    //use friend function to calculate mean
};

//write mean functionality here
float mean(A n,B m){
    float b;
    b=(n.a+m.a)/2;
    return b;
}

int main()
{
    float no1,no2;
    cout<<"enter two values"<<endl;
    cin>>no1>>no2;
    A aobj(no1);
    B bobj(no2);
    cout<<"mean = "<<mean(aobj,bobj)<<endl;
    return 0;
}

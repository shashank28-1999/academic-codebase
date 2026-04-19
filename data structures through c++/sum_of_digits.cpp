#include<iostream>
using namespace std;

class SumDigits
{
    int a,b,c;
    public:
    int calculate(int);
    //create class SumDigits with data members and member function declaration
    //implement function calculate to find sum of digits outside the class
};
int SumDigits::calculate(int a){
    b=1;
    c=0;
    while(a>0){
        b=a%10;
        a=a/10;
        c=c+b;
    }
    return c;
}

int main()
{
    SumDigits s;// object of class SumDigits created
    int n;
    cin>>n;
    cout<<s.calculate(n);// calling calculate() with respect to object s
    return 0;
}

#include<iostream>
using namespace std;
//write required logic
class Complex{
    int a,b;
    public:
    void input(){
        cin>>a>>b;
    }
    Complex operator+(Complex c){
        Complex c1;
        c1.a=a+c.a;
        c1.b=b+c.b;
        return c1;
    }
    Complex operator*(Complex d){
        Complex c2;
        c2.a=a*d.a-b*d.b;
        c2.b=a*d.b+b*d.a;
        return c2;
    }
    void output(){
        cout<<a<<"+"<<b<<"i"<<endl;
    }
};
int main()
{
    Complex x, y, z, z1;
    x.input();
    y.input();
    z=x + y;
    z.output();
    z1=x * y;
    z1.output();
    return 0;
}

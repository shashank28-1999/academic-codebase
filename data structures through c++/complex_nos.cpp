#include<iostream>
using namespace std;
class Complex
{
    int x,y;
    // declare two private integer variables for real and img part of complex number
    //write member functions in public part
    public:
    // define one default constructor and give the values of 5 to real part and 10 to img part
    Complex(){
        x=5;
        y=10;
    }
    // define a parameterized constructor by seeing call in main function
    Complex(int r,int i){
        x=r;
        y=i;
    }
    // declare multiply function to multiply two complex numbers by seeing function call in main()
    Complex multiply(Complex);
    // declare an add function to add two complex numbers by seeing function call in main()
    Complex add(Complex);
    // declare output function by seeing function call in main()
    void output();
};
// define the multiply function outside class
Complex Complex::multiply(Complex c1){
    Complex c2=Complex(x*c1.x-y*c1.y, x*c1.y+y*c1.x);
    return c2;
}
// give the definiton of add function outside class
Complex Complex::add(Complex c3){
    Complex c4=Complex(x+c3.x, y+c3.y);
    return c4;
}
// define output function outside class
void Complex::output(){
    cout<<x<<"+"<<y<<"i"<<endl;
}
int main()
{
    int a,b;
    Complex x;  // object X creation using default constructor
    cout<<"enter real and img part"<<endl;
    cin>>a>>b;
    Complex y(a,b);  // object Y creation using parameterized constructor
    Complex res, res1; //two objects res, res1 created for result storage
    res=x.add(y);      //add() is called with respect to object X and storing result in object res
    res.output();      // displaying the result of add() by calling output function
    res1=x.multiply(y); //multiply() called with respect to object res1 and passing to two complex numbers
    res1.output();     // displaying the result of multiply() by calling output function
    return 0;
}

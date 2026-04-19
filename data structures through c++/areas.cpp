#include <iostream>
#include <math.h>
#define PI 3.14
using namespace std;
class Shape{
    public:
    float area(float);
    float area(float,float);
    float area(float,float,float);
};
float Shape::area(float rad){
    float A;
    A=PI*pow(rad,2);
    return A;
}
float Shape::area(float l,float b){
    float B;
    B=l*b;
    return B;
}
float Shape::area(float x,float y,float z){
    float C;
    float s;
    s=(x+y+z)/2;
    C=sqrt(s*(s-x)*(s-y)*(s-z));
    return C;
}
//Define class here
//write function definition here

int main()
{
    float r,len,bre,a,b,c;
    Shape cir, rect, tri;
    cout<<"Enter radius of circle: ";
    cin>>r;
    cout<<"Enter length and breadth of rectangle: ";
    cin>>len>>bre;
    cout<<"Enter three sides of a triangle: ";
    cin>>a>>b>>c;
    cout<<"Area of circle="<<cir.area(r)<<endl;
    cout<<"Area of rectangle=" << rect.area(len, bre) << endl;
    cout<<"Area of triangle="<<tri.area(a,b,c)<<endl;
    return 0;
}

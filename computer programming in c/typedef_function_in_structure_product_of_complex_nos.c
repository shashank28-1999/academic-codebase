#include<stdio.h>

struct c{
    int real;
    int imaginary;
};
typedef struct c complex;
//declare a structure as typedef consists of 2 fields to access real & imaginary

complex multiplication(complex c1, complex c2){
    complex c3;
    c3.real=c1.real*c2.real-c1.imaginary*c2.imaginary;
    c3.imaginary=c1.real*c2.imaginary+c1.imaginary*c2.real;
    return c3;
}
//Declare function with both structure as argument & as return type, and perform multiplication

void main()
{
    complex c1,c2,c3;
    //declare structure variables

    printf("Enter first complex number : \n");
    //read values
    scanf("%d %d",&c1.real,&c1.imaginary);
    printf("Enter second complex number : \n");
    //read values
    scanf("%d %d",&c2.real,&c2.imaginary);
    c3=multiplication(c1,c2);
    printf("%d+%di",c3.real,c3.imaginary);
    //make function call
    //print result
}

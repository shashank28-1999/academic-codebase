#include <stdio.h>

struct complex{
    float real;
    float imaginary;
};
//declare structure with two elements

struct complex add(struct complex c1, struct complex c2){
    struct complex r;
    r.real=c1.real+c2.real;
    r.imaginary=c1.imaginary+c2.imaginary;
    return r;
}

void main()
{
    struct complex p1,p2;
    struct complex result;
    //declare required structure variables
    printf("enter real & imaginary part of 1st complex number\n");
    scanf("%f",&p1.real);
    scanf("%f",&p1.imaginary);
    //read values
    printf("enter real & imaginary part of 2nd complex number\n");
    scanf("%f",&p2.real);
    scanf("%f",&p2.imaginary);
    //read values
    result=add(p1,p2);
    //write function call
    printf("sum=%0.1f+%0.1fi",result.real,result.imaginary);
    //print result
}

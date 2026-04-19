#include <stdio.h>

struct field{
    int n;
    struct field *p;
};
//declare a structure consisting of 2 fields to read number and pointer to same structure

void main()
{
    struct field a,b,c,*d;
    scanf("%d",&a.n);
    scanf("%d",&b.n);
    scanf("%d",&c.n);
    a.p=&b;
    printf("%d\n",a.n);
    b.p=&c;
    printf("%d\n",b.n);
    c.p=0;
    printf("%d\n",c.n);

    //declare 3 structure variables and 1 pointer to structure variable
    //read the values with structure variables
    //& print them with pointer variable
}

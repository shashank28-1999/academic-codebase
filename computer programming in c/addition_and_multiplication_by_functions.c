/* Write a C program to perform addition & multiplication of two numbers by
   passing parameters to the function & returning the result of addition and multiplication.
sample
input:
10
30
output:
sum is 40
product is 300
*/
#include<stdio.h>
void arith(int n1,int n2,int *s,int *p);
void main()
{
    int a,b,c,r;
    scanf("%d",&a);
    scanf("%d",&b);
    arith(a,b,&c,&r);
    printf("sum is %d\n",c);
    printf("product is %d\n",r);
    //declare required variables
    //read values
    //call function
    //print result
}

void arith(int n1,int n2,int *s,int *p)
{
    *s=n1+n2;
    *p=n1*n2;
    //perform operations(addition and multiplication)
}

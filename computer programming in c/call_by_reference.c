/*write a c program to swap two numbers using call by reference.
sample input:2 3
Before Swapping
x = 2
y = 3
After Swapping
x = 3
y = 2
*/
#include <stdio.h>
void swap(int*a, int*b);
void main()
{
    int n,m;
    scanf("%d",&n);
    scanf("%d",&m);
    printf("Before Swapping\n");
    printf("x=%d\n",n);
    printf("y=%d\n",m);
    swap(&n,&m);
    printf("After Swapping\n");
    printf("x=%d\n",n);
    printf("y=%d",m);
    //declare variables
    //read variables
    //print variables before swapping
    //call the function
    //print variables after swapping
}

void swap(int *a, int *b)
{
    int t;
    t=*a;
    *a=*b;
    *b=t;
}

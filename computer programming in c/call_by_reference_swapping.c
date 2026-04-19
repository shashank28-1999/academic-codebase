#include <stdio.h>
void swap(int*, int*);
void main()
{
    int x,y,z;
    scanf("%d%d",&x,&y);
    printf("Before Swapping\n");
    printf("x= %d\n",x);
    printf("y= %d\n",y);
    swap(&x,&y);
    printf("After Swapping\n");
    printf("x= %d\n",x);
    printf("y= %d\n",y);
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
    //write logic for swapping
}

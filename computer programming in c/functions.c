/*write a C program to find factorial of a number
sample
1. input: 5
   output: 120
2. input: 0
   output: 1
*/
#include<stdio.h>
int fact(int n)
{
    int i,f=1;
    scanf("%d",&n);
    for(i=n;i>0;i--){
        f=f*i;
    }
    return f;
    //declare & initialize the required integer variables
    //write logic to calculate factorial
    //return the result to the called function
}
void main()
{
    int f,n,c;
    c=fact(n);
    printf("%d",c);
    //declare required integer variables
    //function call
    //print the result
}

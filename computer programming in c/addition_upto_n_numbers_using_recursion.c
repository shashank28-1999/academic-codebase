/*Write a C program to find sum of n natural numbers using recursion
sample
input:
5
output:
15
*/
#include <stdio.h>
int addNumbers(int n);

void main()
{
    int a,x;
    scanf("%d",&a);
    x=addNumbers(a);
    printf("%d",x); //declare & read the variable
    //call function & print result
}

int addNumbers(int n)
{
    if(n==1){
        return 1;
    }
    else return n+addNumbers(n-1); //write logic using recursion
}

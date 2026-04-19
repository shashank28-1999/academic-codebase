/*write a C Program to print fibonacci series using recursion
sample input:5(enter the number of terms in series)
output:0 1 1 2 3
*/
#include <stdio.h>
int fibonacci(int n);
void main()
{
    int a,x=0,i;
    scanf("%d",&a);
    for(i=1;i<=a;i++){
        x=fibonacci(i);
        printf("%d ",x);
    }
    //declare and read the required variables
    //write function call
    //print the result
}

int fibonacci(int n)
{
    if(n==1){
        return 0;
    }
    if(n==2){
        return 1;
    }
    if(n>2){
        n=fibonacci(n-1)+fibonacci(n-2);
    return n;
    }
    //write function definition
}

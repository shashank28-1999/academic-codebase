#include<stdio.h>
int factorial(int n){
    if(n<=1){
        return 1;
    }
    else n=n*factorial(n-1);
}
//Write function definition here
void main()
{
    int a,x;
    scanf("%d",&a);
    x=factorial(a);
    printf("%d\n",x);
    //declare & read variable
    //make function call
    //print result
}

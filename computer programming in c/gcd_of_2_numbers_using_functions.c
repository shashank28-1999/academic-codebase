#include<stdio.h>
//write function prototype or function declaration
void gcd(int num1,int num2);
void main()
{
    int num1,num2;
    scanf("%d",&num1);
    scanf("%d",&num2);
    gcd(num1,num2);
    //declare variables
    //read variables from user
    //function call
}

void gcd(int num1,int num2)
{
    while(num1!=num2){
        if(num1>num2){
            num1=num1-num2;
        }
        else num2=num2-num1;
    }
    printf("%d",num1);
    //declare variables
    //write logic to find gcd of two numbers
    //print output
}

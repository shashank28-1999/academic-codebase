#include<stdio.h>
int gcd(int,int);
void main()
{
    int a,b,x;
    scanf("%d",&a);
    scanf("%d",&b);
    x=gcd(a,b);
    printf("%d",x);
    //declare & read variables
    //function call
    // print result
}

int gcd(int n,int m){
    int r;
    if(n>m){
        if(n%m==0){
            return m;
        }
        else r=n%m;
        return gcd(r,m);
    }
    else if(m%n==0){
        return n;
    }
    else r=m%n;
    return gcd(r,n);
    //write function definition here
}

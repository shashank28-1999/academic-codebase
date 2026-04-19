#include<stdio.h>
#include<math.h>

int decimal(int n){
    int i=0,j,k=0,t;
    while(n>0){
        j=n%10;
        n=n/10;
        k=k+pow(2,i)*j;
        i++;
    }
    return k;
}

void main(){
    long n;
    int i=0,j,k=0;
    scanf("%ld",&n);
    while(n>0){
        j=n%1000;
        n=n/1000;
        k=k+pow(10,i)*decimal(j);
        i++;
    }
    printf("%d",k);
}

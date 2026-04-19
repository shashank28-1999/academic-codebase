#include<stdio.h>

long fact(int n){
    long f=1;
    int i;
    for(i=1;i<=n;i++)
        f=f*i;
    return f;
}

void main()
{
    int i,j,k,n;
    long x;
    scanf("%d",&n);
    for(i=0;i<=n;i++){
        for(k=0;k<=(n-i-1);k++){
            printf(" ");
        }
        for(j=0;j<=i;j++){
            x=fact(i)/(fact(j)*fact(i-j));
            printf("%ld ",x);
        }
        printf("\n");
    }
}

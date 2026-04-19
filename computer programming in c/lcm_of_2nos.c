#include<stdio.h>
void main(){
    int n,m,lcm;
    scanf("%d",&n);
    scanf("%d",&m);
    lcm=(n>m)?n:m;
    while(1){
        if(lcm%n==0 && lcm%m==0){
            printf("%d",lcm);
            break;
        }
        lcm++;
    }
}

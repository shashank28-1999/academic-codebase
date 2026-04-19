#include<stdio.h>
int rec_linear_search(int a[10],int n,int m){
    if(m==a[n-1])
        return 1;
    else if(n>0) return rec_linear_search(a,n-1,m);
}
//write function definition here

void main()
{
    int c,b,a[10]={0},i,j;
    scanf("%d",&b);
    for(j=0;j<b;j++){
        scanf("%d",&a[j]);
    }
    scanf("%d",&c);
    //declare & read variables
    i = rec_linear_search(a,b,c);
    //print result
    if(i==1){
        printf("element found");
    }
    else{
        printf("element not found");
    }
}

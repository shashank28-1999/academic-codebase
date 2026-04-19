#include<stdio.h>
void main()
{
    int n,i,j,t;
    int a[10];
    scanf("%d",&n);
    //declare an array and required variables
    //read array size
    for(i=0;i<n;i=i+1){
        scanf("%d",&a[i]);
    }

    for(i=0;i<n;i=i+1){
        for(j=0;j<n-i-1;j=j+1){
            if(a[j]>a[j+1]){
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
    }
    for(j=0;j<n;j=j+1){
        printf("%d\n",a[j]);
    }
}

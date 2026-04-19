#include<stdio.h>
void main()
{
    int n,m,i,s,c[10]={0},a[10]={0},b[10]={0};
    int *p=a;
    int *q=b;
    scanf("%d",&n);
    scanf("%d",&m);
    if(n==m){
        for(i=0;i<n;i=i+1){
            scanf("%d",&a[i]);
        }
        for(i=0;i<m;i=i+1){
            scanf("%d",&b[i]);
        }
        for(i=0;i<n;i=i+1){
            printf("%d ",a[i]);
        }
        for(i=0;i<m;i=i+1){
            printf("%d\n ",b[i]);
        }
        for(i=0;i<n;i=i+1){
            c[i]=+*p+*q;
            p=p+1;
            q=q+1;
        }
        for(i=0;i<n;i=i+1){
            printf("%d\n ",c[i]);
        }
    }
    else {
        printf("array addition not possible");
    }
}

#include<stdio.h>
void main()
{
    int i,j,n,m;
    int a[10][10]={0};
    int b[10][10]={0};
    scanf("%d",&n);
    scanf("%d",&m);
    for(i=0;i<n;i=i+1){
        for(j=0;j<m;j=j+1){
            scanf("%d",&a[i][j]);
        }
    }
    for(i=0;i<n;i=i+1){
        for(j=0;j<m;j=j+1){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    for(i=0;i<n;i=i+1){
        for(j=0;j<m;j=j+1){
            b[j][i]=a[i][j];
        }
    }
    for(j=0;j<m;j=j+1){
        for(i=0;i<n;i=i+1){
            printf("%d ",b[j][i]);
        }
        printf("\n");
    }
    //declare a 2D array and the required variables
}

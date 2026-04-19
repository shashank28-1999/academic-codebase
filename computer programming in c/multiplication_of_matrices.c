#include<stdio.h>
void main()
{
    int n,m,p,q;
    int x[10][10],y[10][10],a[10][10];
    int i,j,k;

    scanf("%d",&n);
    scanf("%d",&m);
    scanf("%d",&p);
    scanf("%d",&q);
    if(m==p){
        for(i=0;i<n;i=i+1){
            for(j=0;j<m;j=j+1){
                scanf("%d",&x[i][j]);
            }
        }
        for(i=0;i<p;i=i+1){
            for(j=0;j<q;j=j+1){
                scanf("%d",&y[i][j]);
            }
        }
        for(i=0;i<n;i=i+1){
            for(j=0;j<q;j=j+1){
                for(k=0;k<m;k=k+1){
                    a[i][j]=a[i][j]+x[i][k]*y[k][j];
                }
            }
        }
        for(i=0;i<n;i=i+1){
            for(j=0;j<m;j=j+1){
                printf("%d ",x[i][j]);
            }
            printf("\n");
        }
        for(i=0;i<p;i=i+1){
            for(j=0;j<q;j=j+1){
                printf("%d ",y[i][j]);
            }
            printf("\n");
        }
        for(i=0;i<n;i=i+1){
            for(j=0;j<q;j=j+1){
                printf("%d ",a[i][j]);
            }
            printf("\n");
        }
    }
}

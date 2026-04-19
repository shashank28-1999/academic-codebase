#include<stdio.h>
void main()
{
    int n,k=1,m,i,a[10]={0};
    int *p;

    scanf("%d",&n);
    for(i=0;i<n;i=i+1){
        scanf("%d",&a[i]);
    }
    p=a;
    m=a[0];
    for(i=1;i<n;i=i+1){
        if(*(p+i)>m){
            m=*(p+i);
            k=i+1;
        }
    }
    printf("biggest element is %d and its position is %d",m,k);
}

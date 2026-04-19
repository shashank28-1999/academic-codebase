#include<stdio.h>
void main()
{
    int i,n,m,a[10]={0};
    int *p;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    p=a;
    scanf("%d",&m);
    if(m<=n){
        *p=*(p+m);
        printf("%d",*p);
    }
    else printf("entered value is beyond the array size");
}

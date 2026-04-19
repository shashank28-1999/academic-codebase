#include<stdio.h>
void main()
{
    int n,m,o,a[10]={0},i,l=0,x,y;
    int *p;
    int *q;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    p=a;
    q=a;
    scanf("%d",&m);
    scanf("%d",&o);
    if(m<n&&o<n&&m>=0&&o>=0){
        x=*(p+m);
        y=*(q+o);
        l=x-y;
        printf("%d",l);
    }
    else printf("entered index values are beyond the array size");
}

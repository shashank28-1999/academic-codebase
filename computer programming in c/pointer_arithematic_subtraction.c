#include<stdio.h>
void main()
{
    int a[10]={0},i,n,m;
    int *p;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    p=&a[n-1];
    scanf("%d",&m);
    if(m<n&&m>=0){
        *p=*(p-m);
        printf("%d",*p);
    }
    else printf("entered value is not with in range of array size");
    //declare an array & required pointers & variables
    //read size of array
    //read array elements
}

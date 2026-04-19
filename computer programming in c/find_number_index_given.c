#include<stdio.h>
void main()
{
    int n,i,m,a[10]={0};
    int *p;
    scanf("%d",&n);
    for(i=0;i<n;i=i+1){
        scanf("%d",&a[i]);
    }
    p=a;
    scanf("%d",&m);
    if(m<n){
        *p=*(p+m);
        printf("%d",*p);
    }
    else printf("entered value is beyond the array size");
    //declare an array & required pointers & variables
    //read size of array
    //read array elements
    //read the index to display the respective value
    //perform pointer arithmatic & display the result
}

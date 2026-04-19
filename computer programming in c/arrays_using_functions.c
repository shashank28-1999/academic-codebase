#include<stdio.h>
#include<math.h>
void power_values(int a[],int n,int p)
{
    int i;
    for(i=0;i<n;i++){
        a[i]=pow(a[i],p);
    }
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    //write logic & print values
}

void main()
{
    int a[10],n,p,i;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    scanf("%d",&p);
    power_values(a,n,p);
    //declare variables
    //read array size & array elements
    //read power factor
    //function call
}

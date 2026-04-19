#include<stdio.h>
int binary(int a[],int key,int low,int high);
void main()
{
    int a[10],n,b,x,i,low=0,high;
    scanf("%d",&high);
    for(i=low;i<high;i++){
        scanf("%d",&a[i]);
    }
    scanf("%d",&b);
    x=binary(a,b,low,high-1);
    if(x==1){
        printf("element is found");
    }
    else printf("element is not found");
    //declare and read required variables
    //call the given function
    //print the result
}

int binary(int a[],int key,int low,int high)
{
    int m;
    m=(low+high)/2;
    if(low<high){
        if(a[m]==key){
            return 1;
        }
        else
        if(a[m]<key){
            return binary(a,key,m+1,high);
        }
        else
        binary(a,key,low,m-1);
    }
}

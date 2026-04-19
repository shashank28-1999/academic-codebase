#include<stdio.h>
#include<stdlib.h>

void main()
{
    int n,i,s=0;
    int *p;
    scanf("%d",&n);
    p=(int *)malloc(n*sizeof(int));
    for(i=0;i<n;i++){
        scanf("%d",&p[i]);
    }
    for(i=0;i<n;i++){
        s=s+p[i];
    }
    printf("sum=%d",s);
    free(p); //always do this
    //declare required integer & pointer variables
    //allocate memory to array using malloc()
    //read elements into array
    //calculate & print sum of all elements of array
}

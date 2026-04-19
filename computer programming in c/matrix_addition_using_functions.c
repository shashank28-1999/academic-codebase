#include <stdio.h>
void matrix_addition(int a[50][50],int b[50][50],int r1,int c1);
void main()
{
    int r1,r2,c1,c2;
    int a[50][50],b[50][50];
    int c[50][50];
    scanf("%d%d", &r1, &c1);
    scanf("%d%d", &r2, &c2);
    if(r1==r2 && c1==c2)
    {
        matrix_addition(a,b,r1,c1); //write function call
    }
    else
        printf("addition of arrays not possible");
}

void matrix_addition(int a[50][50],int b[50][50],int r1,int c1){
    int i,j,c[50][50];
    for(i=0;i<r1;i++){
        for(j=0;j<c1;j++){
            scanf("%d",&a[i][j]);
        }
    }
}

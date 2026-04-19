#include<stdio.h>
#include<stdlib.h>
struct student
{
    int rno;
    char name[20];
    int marks[10];
    int total;
    float avg;
};
void main()
{
    int i,j,n,m;
    struct student student[10];
    scanf("%d",&n);
    scanf("%d",&m);
    for(i=0;i<n;i++){
        scanf("%d",&student[i].rno);
        scanf("%s",student[i].name);
        for(j=0;j<m;j++){
            scanf("%d",&student[i].marks[j]);
        }
    }
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            student[i].total=student[i].total+student[i].marks[j];
        }
        student[i].avg=student[i].total/(m);
    }
    for(i=0;i<n;i++){
        printf("%d ",student[i].rno);
        printf("%s ",student[i].name);
        printf("%d",student[i].total);
        printf("%f",student[i].avg);
    }
    //declare an array of structure variable
}

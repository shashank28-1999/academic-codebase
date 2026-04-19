#include <stdio.h>
#include <stdlib.h>

struct student{
    int rno;
    char name[20];
    int marks[3];
    int total;
    float avg;
};

void main()
{
    struct student a[10];
    struct student *p;
    int n,m,i,j;
    float t;
    scanf("%d %d",&n,&m);
    p=(struct student *)malloc(n*sizeof(struct student));
    for(i=0;i<n;i++){
        scanf("%d",&p[i].rno);
        scanf("%s",p[i].name);
        for(j=0;j<m;j++){
            scanf("%d",&p[i].marks[j]);
        }
    }
    for(i=0;i<n;i++){
        p[i].total=0;
        for(j=0;j<m;j++){
            p[i].total=p[i].total+p[i].marks[j];
        }
        t=p[i].total;
        p[i].avg=t/m;
    }
    for(i=0;i<n;i++){
        printf("%d %s %d %f\n",p[i].rno,p[i].name,p[i].total,p[i].avg);
    }
    free(p);
    //declare pointer to structure variable
}

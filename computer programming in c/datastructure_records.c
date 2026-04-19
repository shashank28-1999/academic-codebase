#include <stdio.h>

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
    int i,j,n,m;
    float t;
    a[0].total=0;
    a[0].avg=0;
    scanf("%d",&n);
    scanf("%d",&m);
    for(i=0;i<n;i++){
        scanf("%d",&a[i].rno);
        scanf("%s",a[i].name);
        for(j=0;j<m;j++){
            scanf("%d",&a[i].marks[j]);
        }
    }
    //declare an array of structure variable
    //declare required variables
    //read n value
    //read m value
    for(i=0;i<n;i++){
        a[i].total=0;
        for(j=0;j<m;j++){
            a[i].total=a[i].total+a[i].marks[j];
        }
        t=a[i].total;
        a[i].avg=t/m;
    }
    //for n records, read rollno, name & 'm' number of subject marks
    //then calculate total & avg(type cast to float) of all subjects of each
    for(i=0;i<n;i++){
        printf("%d %s %d %.6f",a[i].rno,a[i].name,a[i].total,a[i].avg);
        printf("\n");
    }
    //print rollno, name, total & avg as output
}

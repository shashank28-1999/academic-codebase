#include <stdio.h>

struct Employee{
    int eid;
    char ename[20];
    float basic;
    float da,hra,gross;
};
//declare a structure consisting of fields like empid & empname as int
//and also declare basic,da,hra,gross as float variables

void main()
{
    struct Employee e;
    struct Employee *p;
    p=&e;
    //declare required structure variables
    scanf("%d",p->eid);
    scanf("%s",p->ename);
    scanf("%f",p->basic);
    //read empid, empname & basic values as input
    if(p->basic<=10000){
        p->da=0.8*(p->basic);
        p->hra=0.2*(p->basic);
    }
    else if(p->basic<=20000){
        p->da=0.9*(p->basic);
        p->hra=0.25*(p->basic);
    }
    else {
        p->da=0.95*(p->basic);
        p->hra=0.3*(p->basic);
    }
    //then use ***pointer to structure***to calculate da & hra based on the basic
    p->gross=p->basic+p->da+p->hra;
    //calculate the gross
    printf("%d %s %f",p->eid,p->ename,p->gross);
    //print empid, ename & gross
}

#include<stdio.h>

union A{
    char name[20];
    int rno;
};

struct std{
    int marks;
    union A b;
};
//declare a structure consisting of union & a field marks
//and that union consists of 2 fields name & rollno

void main()
{
    struct std a;
    //declare a structure variable
    //declare a char variable to read option
    char c;
    scanf("%c",&c);
    //if option is 'n' then read & print name & marks of a student
    if(c=='n'){
        scanf("%s",a.b.name);
        printf("%s\n",a.b.name);
        scanf("%d",&a.marks);
        printf("%d",a.marks);
    }
    else {
        scanf("%d",&a.b.rno);
        printf("%d\n",a.b.rno);
        scanf("%d",&a.marks);
        printf("%d",a.marks);
    }
    //otherwise read & print rollno & marks of a student
}

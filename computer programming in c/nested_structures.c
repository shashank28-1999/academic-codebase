#include <stdio.h>

//declare an Address structure consisting of fields houseno as integer & street as string
struct address{
    int hno;
    char street[20];
};

/*declare an Employee structure consisting of fields
name as string, age as integer, salary as float and Address as structure*/
struct employee{
    char name[20];
    int age;
    float salary;
    struct address b;
};

void main()
{
    struct employee a;
    //read the details of an employee
    printf("Enter Name, Age, Salary of Employee\n");
    scanf("%s",a.name);
    scanf("%d",&a.age);
    scanf("%f",&a.salary);
    printf("Enter House Number and Street of Employee\n");
    scanf("%d",&a.b.hno);
    scanf("%s",a.b.street);
    //display the details of an employee as in the output
    printf("Name : %s\n",a.name);
    printf("Age : %d\n",a.age);
    printf("Salary : %f\n",a.salary);
    printf("House Number : %d\n",a.b.hno);
    printf("Street : %s\n",a.b.street);
}

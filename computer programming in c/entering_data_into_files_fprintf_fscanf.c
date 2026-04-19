#include <stdio.h>
#include <stdlib.h>

struct student{
    int rno;
    char name[20];
    int total;
}; //declare a student structure consisting of fields like rno, name and total

void main()
{
    struct student a;
    FILE *fp; //declare a structure variable & file pointer variable
    fp=fopen("struct.txt","w");
    if(fp==NULL){
        exit(1);
    }
    while(1){
        scanf("%d",&a.rno);
        if(a.rno==0){break;}
        //open the "struct.txt" file in write mode, read the student record from user
        //any number of records should be until rno=0(zero) is entered.
        scanf("%s %d",a.name,&a.total);
        fprintf(fp,"%d %s %d\n",a.rno,a.name,a.total);
    }
    fclose(fp);
    //then read the contents from file record by record using fscanf and display
    fp=fopen("struct.txt","r");
    while(fscanf(fp,"%d %s %d",&a.rno,a.name,&a.total)!=EOF){
        printf("%d %s %d\n",a.rno,a.name,a.total);
    }
    fclose(fp);
}

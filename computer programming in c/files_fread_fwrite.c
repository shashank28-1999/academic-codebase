#include<stdio.h>
#include<stdlib.h>

struct employee{
    int eid;
    char name[20];
    float salary;
};
//declare a employee structure consisting of fields like eid, name & salary

void main()
{
    struct employee a;
    int i=0;
    FILE *fp;
    //declare required an array of structure variable, integer variable & file pointer
    //enter the size of an array

    fp=fopen("bstd.dat","w");
    if(fp==NULL){
        exit(1);
    }
    //open the "bstd.dat" file in write mode, read the employee record from user
    while(1){
        scanf("%d",&a.eid);
        if(a.eid==0)
            break;
        scanf("%s",a.name);
        scanf("%f",&a.salary);
        fwrite(&a,sizeof(struct employee),1,fp);
    }
    fclose(fp);
    fp=fopen("bstd.dat","r");
    while(fread(&a,sizeof(struct employee),1,fp)){
        printf("%d %s %f\n",a.eid,a.name,a.salary);
    }
    fclose(fp);
}

#include<stdio.h>
struct st
{
    char dname[10];
    char sdname[10][10];
    char fname[10][10][10];
    int ds,sds[10];//declare variables
}dir[10];
void main()
{
    int i,j,k,n;//declare variables
    printf("enter number of directories:");
    scanf("%d",&n);//read no. of directories
    for(i=0;i<n;i++)
    {
        printf("enter directory %d names:",i+1);
        scanf("%s",dir[i].dname);//read directory names
        printf("enter size of directories:");
        scanf("%d",&dir[i].ds);//read size of directory
        for(j=0;j<dir[i].ds;j++)//loop----check with directory size
        {
            printf("enter subdirectory name and size:");
            scanf("%s",dir[i].sdname[j]);//read subdirectory name
            scanf("%d",&dir[i].sds[j]);//read subdirectory size
            for(k=0;k<dir[i].sds[j];k++)//loop for entering file names
            {
                printf("enter file name:");
                scanf("%s",dir[i].fname[j][k]);//read file name;
            }
        }
    }
    printf("\ndirname\t\tsize\tsubdirname\tsize\tfiles");
    printf("\n***************************************************\n");
    for(i=0;i<n;i++)
    {
        printf("%s\t\t%d",dir[i].dname,dir[i].ds);
        for(j=0;j<dir[i].ds;j++)
        {
            printf("\t%s\t\t%d\t",dir[i].sdname[j],dir[i].sds[j]);
            for(k=0;k<dir[i].sds[j];k++)
                printf("%s\t",dir[i].fname[j][k]);
            printf("\n\t\t");
        }
        printf("\n");
    }
}

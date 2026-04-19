/*INPUT
enter number of directorios:1
enter names of directories: a
enter size of directories: 2
enter the file names : b
                       c
OUTPUT:
directory    size    filenames
************************************************
a            2       b
                     c        */

#include<stdio.h>
void main()
{
    //declare variables
    int i,j,master,s[10];
    char d[20][20],f[20][20][20];
    printf("enter number of directorios:");
    scanf("%d",&master);
    //read number of directories
    printf("enter names of directories:");
    for(i=0;i<master;i++)
        scanf("%s",d[i]);
    //read names of directories
    printf("enter size of directories:");
    for(i=0;i<master;i++)
        //read size of directories
        scanf("%d",&s[i]);
    printf("enter the file names :");
    for(i=0;i<master;i++)
        for(j=0;j<s[i];j++)
            scanf("%s",f[i][j]);
    //take two loops...one to check with no. of directories and other to check size of directory
    //read file names
    printf("\n");
    printf(" directory\tsize\tfilenames\n");
    printf("************************************************\n");
    for(i=0;i<master;i++)
    {
        printf("%s\t\t%2d\t",d[i],s[i]);
        for(j=0;j<s[i];j++)
            printf("%s\n\t\t\t",f[i][j]);
        printf("\n");
    }
    printf("\t\n");
}

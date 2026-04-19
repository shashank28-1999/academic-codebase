/*
output:
this is tutorialspoint
*/
#include <stdio.h>
#include <string.h>

void main()
{
    FILE *fp;
    char str[] = "this is tutorialspoint";
    char buffer[100];
    //Open file("file.txt") in both writing and reading mode
    fp=fopen("file.txt","w+");
    //Write sentence(i.e present in str) to the file using fwrite
    fwrite(str,sizeof(str),1,fp);
    //then move the filepointer to beginning of the file using fseek()
    fseek(fp,0,SEEK_SET);
    //now read the contents from the file using fread to "buffer variable" and print
    fread(buffer,sizeof(str),1,fp);
    printf("%s",buffer);
    fclose(fp);
}

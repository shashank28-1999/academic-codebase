#include <stdio.h>
#include <stdlib.h>

int main()
{
    //declare the variables
    char Filename[20];
    char filename[20];
    printf("Enter the filename to open for reading \n");
    scanf("%s",Filename);
    //read the filename to open for reading
    FILE *fptr1=fopen("a.txt","r");
    // Open one file(file name=a.txt) for reading, if file pointer returns NULL exit
    if(fptr1==NULL){
        printf("Cannot open file");
        exit(1);
    }
    fclose(fptr1);

    printf("Enter the filename to open for writing \n");
    scanf("%s",filename);
    //read the filename to open for writing
    fptr1=fopen("a.txt","r");
    // Open another file(file name=b.txt) for writing, if file pointer returns NULL exit
    FILE *fptr2=fopen("b.txt","w");

    char c = fgetc(fptr1);
    while(c != EOF)
    {
        fputc(c, fptr2);
        c = fgetc(fptr1);
    }
    printf("\nContents copied to %s", filename);

    fclose(fptr1);
    fclose(fptr2);
    return 0;
}

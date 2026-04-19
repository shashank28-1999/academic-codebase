#include <stdio.h>
#include <stdlib.h>

void main()
{
    FILE *fp1,*fp2,*fp3;
    char c,d,e;
    fp1=fopen("file1.txt","r");
    fp2=fopen("file2.txt","r");
    fp3=fopen("file3.txt","w");
    if(fp1==NULL||fp2==NULL||fp3==NULL){
        printf("unable to open file");
        exit(1);
    }
    //open file3.txt in write mode
    while(1){
        c=fgetc(fp1);
        if(c==EOF){
            break;
        }
        fputc(c,fp3);
    }
    while(1){
        d=fgetc(fp2);
        if(d==EOF){
            break;
        }
        fputc(d,fp3);
    }
    fclose(fp1);
    fclose(fp2);
    fclose(fp3);
    //declare require variables to access information from files
    printf("Merged file1.txt and file2.txt into file3.txt \n");
    //read information from file1.txt, file2.txt and place it in file3.txt
    fp3=fopen("file3.txt","r");
    while(1){
        e=fgetc(fp3);
        if(e==EOF){
            break;
        }
        printf("%c",e);
    }
    fclose(fp3);
}

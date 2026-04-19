#include <stdio.h>
#include <stdlib.h>

void main()
{
    FILE *fp1,*fp2;
    char c; //declare required file pointer variables
    fp1=fopen("file1.txt","r");
    fp2=fopen("file2.txt","w");
    //Access the contents from "file1.txt", display it on screen
    //then convert the lowercase characters into uppercase in "file1.txt" and
    //place it in "file2.txt"
    if(fp1==NULL||fp2==NULL){
        printf("unable to open file");
        exit(1);
    }
    while(1){
        c=fgetc(fp1);
        if(c==EOF){
            break;
        }
        printf("%c",c);
        if(c>='a' && c<='z'){
            c=c-32;
        }
        fputc(c,fp2);
    }
    fclose(fp1);
    fclose(fp2);
    printf("\n");
    //now read the contents from "file2.txt" and also display on screen
    fp2=fopen("file2.txt","r");
    while(1){
        c=fgetc(fp2);
        if(c==EOF){
            break;
        }
        printf("%c",c);
    }
    fclose(fp2);
    printf("\nfile content converted and copied successfully");
}

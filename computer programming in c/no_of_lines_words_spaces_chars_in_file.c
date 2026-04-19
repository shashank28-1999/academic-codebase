#include<stdio.h>
void main()
{
    FILE *fp;
    char a;
    int i=0,j=0,k=0,l=0;
    fp=fopen("test3.c","r");
    do{
        a=fgetc(fp);
        i++;
        if(a=='\n'){
            j++;
        }
        if(a==' '){
            k++;
        }
        if(a==' '||a=='\n'){
            l++;
        }
    }while(a!=EOF);
    printf("number of characters in file=%d\n",i);
    printf("number of lines in file=%d\n",j);
    printf("number of spaces in file=%d\n",k);
    printf("number of words in file=%d",l);
    fclose(fp);
}

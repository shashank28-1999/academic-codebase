#include<stdio.h>
#include<string.h>
void main()
{
    char s[20],t[20],u[20];
    int i;
    scanf("%s",s);
    strcpy(t,s);
    for(i=0;t[i]!='\0';i++){
        if(t[i]<='Z'&&t[i]>='A'){
            t[i]=t[i]+32;
        }
        else t[i]=t[i]-32;
    }
    printf("given string=%s\n",s);
    printf("copied string=%s\n",t);
    //declare required character arrays
    //declare required variables
}

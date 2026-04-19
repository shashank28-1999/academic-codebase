#include<stdio.h>
#include<string.h>
void main()
{
    char s[15]={0};
    char t[15]={0};
    char u[30]={0};
    int i,j;
    scanf("%s",s);
    scanf("%s",t);
    for(i=0;s[i]!='\0';i++){
        u[i]=s[i];
    }
    for(j=0;t[j]!='\0';j++){
        u[i+j]=t[j];
    }
    u[i+j]='\0';
    printf("first string=%s\n",s);
    printf("second string=%s\n",t);
    printf("resultant string=%s\n",u);
}

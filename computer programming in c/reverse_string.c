#include <stdio.h>
#include <string.h>
void main()
{
    int i,j=0,n;
    char s[20]={0},r[20]={0};
    scanf("%s",s);
    for(i=0;s[i]!='\0';i++){
        j=j+1;
    }
    n=j;
    for(i=0;i<j;i++){
        r[i]=s[n-i-1];
    }
    printf("%s",r);
}

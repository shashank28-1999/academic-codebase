#include <stdio.h>
#include <string.h>
void main()
{
    int i,j;
    char s[20]={0};
    char p;
    scanf("%s",s);
    for(i=0;s[i]!='\0';i++){
        j=i;
    }
    for(i=0;s[i]!='\0';i++){
        if(i<j){
            p=s[i];
            s[i]=s[j];
            s[j]=p;
            j--;
        }
    }
    printf("%s",s);
    //declare the string and required variables
}

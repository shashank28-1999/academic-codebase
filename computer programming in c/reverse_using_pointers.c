#include<stdio.h>
#include<string.h>
void main()
{
    char s[10]={0},r[20]={'\0'};
    int i,j=0;
    char *p;
    scanf("%s",s);
    p=s;
    for(i=0;s[i]!='\0';i++){
        *(p+i)=s[i];
        j++;
    }
    for(i=0;s[i]!='\0';i++){
        j--;
        r[i]=*(p+j);
    }
    printf("%s",r);
    //declare the string and required variables
    //read the string
    //find the length of the string
    //write the logic to find the reverse of the string
    //print the reverse of a string
}

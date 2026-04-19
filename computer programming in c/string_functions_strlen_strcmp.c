#include<stdio.h>
#include<string.h>
void main()
{
    char s[20],t[20];
    char c,d,e;
    scanf("%s",s);
    scanf("%s",t);
    c=strcmp(s,t);
    d=strlen(s);
    e=strlen(t);
    if(d==e){
        if(c==0){
            printf("both the strings are equal");
        }
        else { printf("strings are different");}
    }
    else
        printf("length of strings are not equal");
    //declare required char arrays
    //declare required variables
    //read input strings
    //write logic & print output (as shown in sample output)
}

/*
sample input1:kmit(input string)
output:length=4
sample input2:kmithyd(input string)
output:length=7
*/
#include <stdio.h>
#include<string.h>
void main()
{
    char s[20];
    int n,i;
    char *p;
    p=s;
    scanf("%s",s);
    for(i=0;s[i]!='\0';i++){
        p++;
    }
    printf("length=%d",i);
    //required variables & pointers
    //read the input string
    //write the logic to find length of a string
}

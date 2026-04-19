#include <stdio.h>
#include <string.h>
void main()
{
    int i,a[26]={0};
    char s[20]={0},c;
    scanf("%s",s);
    for(i=0;s[i]!='\0';i++){
        if(s[i]<='z'&&s[i]>='a')
            a[s[i]-'a']++;
    }
    for(i=0;i<26;i++){
        if(a[i]>0){
            printf("%c=%d\n",i+'a',a[i]);
        }
    }
    //declare a character array and the required variables
    //read the string
}

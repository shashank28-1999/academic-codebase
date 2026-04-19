#include<stdio.h>
#include<string.h>
void main(){
    char s[30],a;
    int i,j;
    scanf("%s",s);
    for(i=0;i<strlen(s);i++){
        for(j=0;j<strlen(s)-i-1;j++){
            if(s[j]>s[j+1]){
                a=s[j];
                s[j]=s[j+1];
                s[j+1]=a;
            }
        }
    }
    printf("%s",s);
}

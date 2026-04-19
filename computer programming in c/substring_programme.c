#include<stdio.h>
void main()
{
    int i,j=0,n,m;
    char s[20];
    scanf("%s",s);
    scanf("%d",&n);
    scanf("%d",&m);
    for(i=0;s[i]!='\0';i++){
        j++;
    }
    if(n<=m&&m<j){
        printf("str=%s\n",s);
        printf("substr=");
        for(i=n;i<=m;i++){
            printf("%c",s[i]);
        }
    }
    else printf("entered indices are beyond size");
}

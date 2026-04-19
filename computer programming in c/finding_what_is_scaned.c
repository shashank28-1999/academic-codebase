#include <stdio.h>
#include <string.h>
void main()
{
    char a;
    scanf("%c",&a);
    if('A'<=a&&a<='Z'||'a'<=a&&a<='z'){
        printf("alphabet");
    }
    else{ if('0'<=a&&a<='9'){
        printf("number");}
        else printf("special character");
    }
}

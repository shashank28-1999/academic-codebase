/*write a c program to convert the lower case string into upper case string
USING POINTERS.

sample input1:kmit(input string)
output:KMIT
sample input2:KMITCoLlEgE(input string)
OUTPUT:KMITCOLLEGE
*/
#include <stdio.h>
#include<string.h>
void main()
{
    char s[20];
    int i,j;
    scanf("%s",s);
    for(i=0;s[i]!=0;i++){
        if(s[i]<=121&&s[i]>=97){
            s[i]=s[i]-32;
        }
    }
    printf("%s",s);
}

/*write a C program to count vowels and consonants in a string using pointers.

sample input1:kmit(input string)
output:vowels=1
       consonants=3

sample input2:NeilGogte(input string)
output:vowels=4
       consonants=5
*/
#include <stdio.h>
#include<string.h>
void main()
{
    char s[20];
    int c=0,n=0,i,j;
    scanf("%s",s);
    for(i=0;s[i]!='\0';i++){
        if(s[i]=='a'||s[i]=='A'||s[i]=='e'||s[i]=='E'||s[i]=='i'||s[i]=='I'||s[i]=='o'||s[i]=='O'||s[i]=='u'||s[i]=='U'){
            c=c+1;
        }
        else
            n=n+1;
    }
    printf("vowels=%d\n",c);
    printf("consonants=%d",n);
    //declare a character array and the required variables & pointers
    //read the string
    //write logic to find the no of vowels and consonants
    //print output(as given in the sample output)
}

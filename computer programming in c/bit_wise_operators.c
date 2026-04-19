#include <stdio.h>
void main(){
    unsigned int word1=0152,word2=0431,w1=05;
    printf("%o\n",word1 & word2);
    printf("%d\n",word1 & word2);
    printf("%o\n",word1 | word2);
    printf("%d\n",word1 | word2);
    word1 ^= word2;
    word2 ^= word1;
    word1 ^= word2;
    printf("%o %o\n",word1,word2);
    printf("%d %d\n",word1,word2);
    printf("%o\n",w1 << 1);
    printf("%d\n",w1 << 1);
    printf("%o\n",w1 >> 1);
    printf("%d\n",w1 >> 1);
}

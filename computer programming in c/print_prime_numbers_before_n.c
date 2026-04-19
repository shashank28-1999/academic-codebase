#include<stdio.h>
void main()
{
    int n;
    int s;
    int i;
    int count=0;
    scanf("%d",&n);
    for(i=2;i<=n;i++)
    {
        count=0;
        for(s=2;s<i;s++)
        {
            if(i%s==0)
            {
                count=1;
                break;
            }
        }
        if(count==0)
        {
            printf("%d \n",i);
        }
    }
}

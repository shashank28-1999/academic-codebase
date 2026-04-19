#include<stdio.h>
int main()
{
    int nop,ms,ps,np,rempages,i,j,x,y,pa,offset;
    int s[10],fno[10][20];
    //Declare variables
    printf("\nEnter the memory size -- ");
    scanf("%d",&ms);
    //read memory size
    printf("\nEnter the page size -- ");
    scanf("%d",&ps);
    //read page size
    nop = ms/ps;
    printf("\nThe no. of pages available in memory are -- %d ",nop);
    printf("\nEnter number of processes -- ");
    //read no. of process
    scanf("%d",&np);
    rempages = nop;
    for(i=1;i<=np;i++)
    {
        printf("\nEnter no. of pages required for p[%d]-- ",i);
        scanf("%d",&s[i]);
        //Read no. of pages required for page
        if(s[i] >rempages)
        {
            printf("\nMemory is Full");
            break;
        }
        rempages = rempages - s[i];
        printf("\nEnter pagetable for p[%d] --- ",i);
        for(j=0;j<s[i];j++)
            scanf("%d",&fno[i][j]);
    }
    printf("\nEnter Logical Address to find Physical Address ");
    printf("\nEnter process no. and pagenumber and offset -- ");
    scanf("%d %d %d",&x,&y,&offset);
    //read process number, page number and offset
    if(x>np || y>=s[x] || offset>=ps)
        printf("\nInvalid Process or Page Number or offset");
    else
    {
        pa=fno[x][y]*ps+offset;
        //get the physical address by multiplying page number with page size and add it to offset
        printf("\nThe Physical Address is -- %d",pa);
    }
    return 0;
}

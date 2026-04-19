#include <stdio.h>

void main()
{
    int i,n,k,abt=0,temp,p[20],bt[20],pri[20],tat[20],wt[20];
    float tatavg,wtavg; //initialize variables
    printf("Enter the number of processes --- ");
    scanf("%d",&n); //read number of processes
    for(i=0;i<n;i++)
    {
        p[i] = i;
        printf("Enter the Burst Time & Priority of Process %d --- ",i);
        scanf("%d %d",&bt[i], &pri[i]); //read burst time and priority
    }
    for(i=0;i<n;i++)
        for(k=i+1;k<n;k++)
            if(pri[i] > pri[k])
            {
                temp=pri[i];
                pri[i]=pri[k];
                pri[k]=temp;
                temp=p[i];
                p[i]=p[k];
                p[k]=temp;
                temp=bt[i];
                bt[i]=bt[k];
                bt[k]=temp;
            }
    //swap processes, burst time according to priority
    wtavg = 0;
    tatavg = 0;
    for(i=0;i<n;i++)
    {
        tat[i]=bt[i]+abt;
        wt[i]=tat[i]-bt[i];
        abt=abt+bt[i];
        wtavg=wt[i]+wtavg; //calculate avg waiting time and avg turn around time
        tatavg=tat[i]+tatavg;
    }
    printf("\nPROCESS\t\tPRIORITY\tBURST TIME\tWAITING TIME\tTURNAROUND TIME");
    for(i=0;i<n;i++)
        printf("\n%d\t\t%d\t\t%d\t\t%d\t\t%d ",p[i],pri[i],bt[i],wt[i],tat[i]);
    printf("\nAverage Waiting Time is --- %f",wtavg/n);
    printf("\nAverage Turnaround Time is --- %f",tatavg/n);
}

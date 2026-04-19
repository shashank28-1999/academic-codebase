#include <stdio.h>

void main()
{
    int i,n,m=0;
    int bt[10]={0};
    int wt[10]={0};
    int ct[10]={0};
    float wtavg,tatavg;
    int tat[10]={0};

    printf("Enter the processes---");
    //read the no.of processes
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("\n Enter the burst time for process %d",i);
        //read the burst time for process
        scanf("%d",&bt[i]);
    }
    wt[0]=wtavg=0;
    tat[0]=tatavg=bt[0];
    //calculate average waiting time and average turn around time
    for(i=0;i<n;i++){
        m=m+bt[i];
        tat[i]=m;
        wt[i]=tat[i]-bt[i];
    }
    wtavg=0;
    for(i=0;i<n;i++){
        wtavg=wtavg+wt[i];
    }
    tatavg=0;
    for(i=0;i<n;i++){
        tatavg=tatavg+tat[i];
    }
    printf("\n\tPROCESS\tBURST TIME\tWAITING TIME\tTURAROUND TIME\n");
    for(i=0;i<n;i++)
    {
        printf("\n\tp%d\t\t%d\t\t%d\t\t%d",i,bt[i],wt[i],tat[i]);
    }
    printf("\n Average waiting time is---.2%f",wtavg/n);
    printf("\n Average turnaround time is---.2%f",tatavg/n);
}

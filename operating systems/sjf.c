#include <stdio.h>

void main()
{
    int i,j,k,n;
    float wtavg=0,tatavg=0;
    int bt[10],p[10],wt[10],tat[10];
    int temp;

    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&bt[i]);
        p[i]=i+1;
    }

    // Sort by burst time (SJF - non-preemptive)
    for(i=0;i<n;i++){
        for(k=i+1;k<n;k++){
            if(bt[i]>bt[k]){
                temp=bt[i];
                bt[i]=bt[k];
                bt[k]=temp;
                temp=p[i];
                p[i]=p[k];
                p[k]=temp;
            }
        }
    }

    wt[0] = wtavg = 0;
    tat[0] = tatavg = bt[0];
    for(i=1;i<n;i++)
    {
        //calculate waiting time, turnaround time, avg waiting time and avg turnaround time
    }
    for(i=1;i<n;i++)
    {
        wt[i]=wt[i-1]+bt[i-1];
    }
    for(i=1;i<n;i++)
    {
        wtavg+=wt[i];
    }
    for(i=1;i<n;i++)
    {
        tat[i]=tat[i-1]+bt[i];
    }
    for(i=1;i<n;i++)
    {
        tatavg+=tat[i];
    }

    printf("\n\t PROCESS \tBURST TIME \t WAITING TIME\t TURNAROUND TIME\n");
    for(i=0;i<n;i++)
        printf("\n\t P%d \t\t %d \t\t %d \t\t %d",p[i],bt[i],wt[i],tat[i]);

    printf("\n\nAverage Waiting Time = %f",wtavg/n);
    printf("\nAverage Turnaround Time = %f",tatavg/n);
}

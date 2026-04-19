#include <stdio.h>

int main()
{
    int time_quantum,i,remain,n,rt[10],bt[10],flag=0,at[10],wait_time=0,turnaround_time=0,time;

    //declare the variable
    printf("Enter Total Process:\t ");
    scanf("%d",&n);
    //read the no.of processes
    remain=n;
    for(i=0;i<n;i++)
    {
        printf("Enter Arrival Time and Burst Time for Process Number %d :",i+1);
        //read arrival time and burst time for a process
        scanf("%d",&at[i]);
        scanf("%d",&bt[i]);
        rt[i]=bt[i];
    }
    printf("Enter Time Quantum:\t");
    scanf("%d",&time_quantum);
    //read quantum time
    printf("\n\nProcess\t|Turnaround Time|Waiting Time\n\n");
    for(time=0,i=0;remain!=0;)
    {
        if(rt[i]<=time_quantum && rt[i]>0)
        {
            time+=rt[i];
            rt[i]=0;
            flag=1;
        }
        else if(rt[i]>0)
        {
            rt[i]=rt[i]-time_quantum;
            time+=time_quantum;
            //Subtract time quantum from remaining time and place the value in rt
            //Add time and time quantum and place the value in time
        }
        if(rt[i]==0 && flag==1)
        {
            remain--;
            rt[i]=0;
            flag=1;
            printf("P[%d]\t|\t%d\t|\t%d\n",i+1,time-at[i],time-at[i]-bt[i]);
            wait_time+=time-at[i]-bt[i];
            turnaround_time+=time-at[i];
            flag=0;
        }
        if(i==n-1)
            i=0;
        else if(at[i+1]<=time)
            i++;
        else
            i=0;
    }
    printf("\nAverage Waiting Time= %f\n",wait_time*1.0/n);
    printf("Avg Turnaround Time = %f",turnaround_time*1.0/n);

    return 0;
}

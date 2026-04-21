import java.util.*;
class Job
{
    int k,i;
    Scanner sc=new Scanner(System.in);

    int jobseq(int n, int d[], int p[])
    {
        int r,t;
        int j[]=new int[n+1];
        int profit=0;
        for(int i=1;i<=n;i++){
            for(int k=d[i];k>0;k--){
                if(j[k]==0){
                    profit=profit+p[i];
                    j[k]=p[i];
                    break;
                }
            }
        }

        //add code here.......

        return profit;
    }
}

class Jobtest
{
    public static void main(String args[])
    {
        Job obj=new Job();
        int optsoln;
        int n,i,j,temp;
        int p[],d[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of objects:");
        n=sc.nextInt();
        p=new int[n+1];
        d= new int[n+1];
        System.out.println("Enter the deadlines and profits:");
        for(i=1;i<=n;i++)
        {
            d[i]=sc.nextInt();
            p[i]=sc.nextInt();
        }
        for (i =1;i<=n;i++) {
            for (j = i + 1; j <=n; j++) {
                if (p[i] < p[j]) {
                    temp = p[j];
                    p[j] =p[i];
                    p[i] = temp;

                    temp = d[j];
                    d[j] =d[i];
                    d[i] = temp;
                }
            }
        }
        System.out.println("After sorting profits and deadlines are");
        for(i=1;i<=n;i++)
            System.out.println("p["+"i"+"]="+ p[i]+" "+"d["+"i"+"]="+ d[i]);
        optsoln=obj.jobseq(n,d,p);
        System.out.println("the optimal solution:"+optsoln);
    }
}

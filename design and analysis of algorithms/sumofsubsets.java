import java.util.Scanner;

class SumOfSubsets
{
    int[] w;
    int[] x;
    int sum;
    int n;
    int total;

    void process()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        n = sc.nextInt();
        w = new int[n + 1];
        x = new int[n + 1];
        total = 0;
        System.out.println("Enter "+n+" Elements:");
        for (int i = 1; i < n + 1; i++)
        {
            w[i] = sc.nextInt();
            total += w[i];
        }
        System.out.println("Enter the sum to be obtained:");
        sum = sc.nextInt();
        if (total < sum)
        {
            System.out.println("Not possible to obtain the subset!!!");
            System.exit(1);
        }
        subset(0, 1, total);
    }

    void subset(int s, int k, int r)
    {
        //add code here......
        if(s+w[k]==sum)
        {
            x[k]=1;
            System.out.println("solution set is:");
            for(int i=1;i<k+1;i++)
            {
                System.out.print(x[i]+" ");
            }
            System.out.println();
            return ;
        }
        if(k<n && s+w[k]+w[k+1]<=sum  && s+total-w[k]>=sum)
        {
            x[k]=1;
            subset(s+w[k],k+1,total-w[k]);
        }
        if(k<n && s+w[k+1]<=sum  && s+total-w[k]>=sum)
        {
            x[k]=0;
            subset(s,k+1,total-w[k]);
        }
    }

    public static void main(String[] args)
    {
        new SumOfSubsets().process();
    }
}

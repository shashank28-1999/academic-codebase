import java.util.*;

class Knapsack01
{
    int knapsack(int W, int wt[], int val[], int n)
    {
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++)
        {
            for (int w = 0; w <= W; w++)
            {
                if (i == 0 || w == 0)
                    dp[i][w] = 0;
                else if (wt[i - 1] <= w)
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }

        return dp[n][W];
    }

    void printSelectedItems(int W, int wt[], int val[], int n)
    {
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++)
        {
            for (int w = 0; w <= W; w++)
            {
                if (i == 0 || w == 0)
                    dp[i][w] = 0;
                else if (wt[i - 1] <= w)
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }

        // Traceback to find selected items
        System.out.println("Selected items (1 = selected, 0 = not selected):");
        int w = W;
        for (int i = n; i > 0; i--)
        {
            if (dp[i][w] != dp[i - 1][w])
            {
                System.out.println("Item " + i + " (weight=" + wt[i-1] + ", profit=" + val[i-1] + ") -> Selected");
                w -= wt[i - 1];
            }
            else
            {
                System.out.println("Item " + i + " (weight=" + wt[i-1] + ", profit=" + val[i-1] + ") -> Not selected");
            }
        }

        System.out.println("Maximum profit = " + dp[n][W]);
    }
}

class KnapsackTest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items:");
        int n = sc.nextInt();

        int val[] = new int[n];
        int wt[]  = new int[n];

        System.out.println("Enter profit and weight of each item:");
        for (int i = 0; i < n; i++)
        {
            System.out.print("Item " + (i + 1) + " profit: ");
            val[i] = sc.nextInt();
            System.out.print("Item " + (i + 1) + " weight: ");
            wt[i] = sc.nextInt();
        }

        System.out.println("Enter knapsack capacity:");
        int W = sc.nextInt();

        Knapsack01 ob = new Knapsack01();
        ob.printSelectedItems(W, wt, val, n);
    }
}

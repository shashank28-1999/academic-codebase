import java.util.*;

class OptimalBST
{
    // Returns the sum of p[i..j]
    int sum(double p[], int i, int j)
    {
        double s = 0;
        for (int k = i; k <= j; k++)
            s += p[k];
        return (int) s;
    }

    // Returns cost of Optimal BST for keys freq[i..j]
    double optimalBST(double p[], int n)
    {
        // cost[i][j] = optimal cost of BST for keys from i to j
        double cost[][] = new double[n + 2][n + 2];

        // For a single key, cost is equal to its frequency
        for (int i = 1; i <= n; i++)
            cost[i][i] = p[i];

        // Now consider chains of increasing length
        for (int len = 2; len <= n; len++)
        {
            for (int i = 1; i <= n - len + 1; i++)
            {
                int j = i + len - 1;
                cost[i][j] = Double.MAX_VALUE;

                double sumP = 0;
                for (int k = i; k <= j; k++)
                    sumP += p[k];

                // Try each key as root
                for (int r = i; r <= j; r++)
                {
                    double leftCost  = (r > i) ? cost[i][r - 1] : 0;
                    double rightCost = (r < j) ? cost[r + 1][j] : 0;
                    double c = leftCost + rightCost + sumP;
                    if (c < cost[i][j])
                        cost[i][j] = c;
                }
            }
        }

        printTable(cost, n);
        return cost[1][n];
    }

    void printTable(double cost[][], int n)
    {
        System.out.println("Optimal BST Cost Table:");
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (j < i)
                    System.out.printf("%8.2f", 0.0);
                else
                    System.out.printf("%8.2f", cost[i][j]);
            }
            System.out.println();
        }
    }
}

class OptimalBSTTest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of keys:");
        int n = sc.nextInt();

        // p[1..n] — 1-indexed
        double p[] = new double[n + 1];
        System.out.println("Enter search probabilities for each key:");
        for (int i = 1; i <= n; i++)
        {
            System.out.print("p[" + i + "]: ");
            p[i] = sc.nextDouble();
        }

        OptimalBST ob = new OptimalBST();
        double minCost = ob.optimalBST(p, n);
        System.out.printf("Minimum cost of Optimal BST = %.2f%n", minCost);
    }
}

import java.util.*;

class TSP
{
    int n;
    int[][] dist;
    int[][] dp;
    int[][] parent;
    static final int INF = Integer.MAX_VALUE / 2;

    TSP(int n, int[][] dist)
    {
        this.n    = n;
        this.dist = dist;
        dp        = new int[1 << n][n];
        parent    = new int[1 << n][n];
    }

    void solve()
    {
        // Initialize dp table
        for (int[] row : dp)
            Arrays.fill(row, INF);
        for (int[] row : parent)
            Arrays.fill(row, -1);

        // Start from vertex 0
        dp[1][0] = 0;

        // Iterate over all subsets of vertices
        for (int mask = 1; mask < (1 << n); mask++)
        {
            for (int u = 0; u < n; u++)
            {
                if ((mask & (1 << u)) == 0) continue; // u not in subset
                if (dp[mask][u] == INF)     continue;

                // Try extending path to vertex v
                for (int v = 0; v < n; v++)
                {
                    if ((mask & (1 << v)) != 0) continue; // v already visited
                    if (dist[u][v] == 0)        continue; // no edge

                    int newMask = mask | (1 << v);
                    int newCost = dp[mask][u] + dist[u][v];

                    if (newCost < dp[newMask][v])
                    {
                        dp[newMask][v]     = newCost;
                        parent[newMask][v] = u;
                    }
                }
            }
        }

        // Find minimum cost to return to vertex 0
        int fullMask = (1 << n) - 1;
        int minCost  = INF;
        int lastNode = -1;

        for (int u = 1; u < n; u++)
        {
            if (dist[u][0] == 0) continue;
            if (dp[fullMask][u] + dist[u][0] < minCost)
            {
                minCost  = dp[fullMask][u] + dist[u][0];
                lastNode = u;
            }
        }

        if (minCost == INF)
        {
            System.out.println("No Hamiltonian cycle exists.");
            return;
        }

        System.out.println("Minimum cost of TSP tour: " + minCost);

        // Trace path
        List<Integer> path = new ArrayList<>();
        int mask = fullMask;
        int curr = lastNode;
        while (curr != -1)
        {
            path.add(curr);
            int prev = parent[mask][curr];
            mask ^= (1 << curr);
            curr  = prev;
        }
        Collections.reverse(path);
        path.add(0); // return to start

        System.out.print("Optimal Tour: ");
        for (int v : path)
            System.out.print((v + 1) + " -> ");
        System.out.println("(back to start)");
    }
}

class TSPTest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] dist = new int[n][n];
        System.out.println("Enter cost matrix (use 0 for no edge / diagonal):");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                dist[i][j] = sc.nextInt();

        TSP tsp = new TSP(n, dist);
        tsp.solve();
    }
}

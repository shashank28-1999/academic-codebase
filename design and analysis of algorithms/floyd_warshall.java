import java.util.*;

class FloydWarshall
{
    int V;
    static final int INF = 99999;

    FloydWarshall(int v)
    {
        V = v;
    }

    void floydWarshall(int graph[][])
    {
        int dist[][] = new int[V][V];
        int i, j, k;

        // Initialize distance matrix same as input graph
        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                dist[i][j] = graph[i][j];

        // Update dist[i][j] by considering each vertex as intermediate
        for (k = 0; k < V; k++)
        {
            for (i = 0; i < V; i++)
            {
                for (j = 0; j < V; j++)
                {
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }

        printSolution(dist);
    }

    void printSolution(int dist[][])
    {
        System.out.println("All pairs shortest path distances:");
        System.out.print("     ");
        for (int i = 0; i < V; i++)
            System.out.printf("%5d", (i + 1));
        System.out.println();

        for (int i = 0; i < V; i++)
        {
            System.out.printf("%5d", (i + 1));
            for (int j = 0; j < V; j++)
            {
                if (dist[i][j] == INF)
                    System.out.printf("%5s", "INF");
                else
                    System.out.printf("%5d", dist[i][j]);
            }
            System.out.println();
        }
    }
}

class FloydTest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices:");
        int V = sc.nextInt();

        int graph[][] = new int[V][V];
        System.out.println("Enter cost matrix (use 99999 for INF/no edge, 0 for diagonal):");
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                graph[i][j] = sc.nextInt();

        FloydWarshall ob = new FloydWarshall(V);
        ob.floydWarshall(graph);
    }
}

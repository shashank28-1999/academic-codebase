import java.util.*;
import java.lang.*;
import java.io.*;

class ShortestPath
{
    int minDistance(int dist[], Boolean sptSet[], int V)
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;

        //add code here to find the vertex with minimum distance value.....
        for(int i=0;i<V;i++)
        {
            if(!sptSet[i] && dist[i]<=min)
            {
                min_index=i;
                min=dist[i];
            }
        }

        return min_index;
    }

    void printSolution(int dist[], int V)
    {
        for (int i = 0; i < V; i++)
        {
            System.out.print("Vertex Distance from Source");
            System.out.print(" "+"to "+(i+1)+" distance is="+dist[i]);
            System.out.println();
        }
    }

    void dijkstra(int graph[][], int src, int V)
    {
        //add code according to the comments below.......

        int dist[] = new int[V]; // The output array. dist[i] will hold
                                 // the shortest distance from src to i

        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];

        // Initialize all distances as INFINITE and sptSet[] as false
        for(int i=0;i<V;i++)
        {
            dist[i]=Integer.MAX_VALUE;
            sptSet[i]=false;
        }

        // Distance of source vertex from itself is always 0
        dist[src]=0;
        for(int count=0;count<V-1;count++)
        {
            int u=minDistance(dist,sptSet,V);
            sptSet[u]=true;
            for(int i=0;i<V;i++)
            {
                if(!sptSet[i] && graph[u][i]!=0 && dist[u]+graph[u][i]<dist[i])
                {
                    dist[i]=dist[u]+graph[u][i];
                }
            }
        }

        printSolution(dist,V);

        // print the constructed distance array
    }

    public static void main (String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter noof vertices");
        n=sc.nextInt();
        int graph[][] = new int[n][n];

        System.out.println("enter cost matrix");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                graph[i][j]=sc.nextInt();

        ShortestPath t = new ShortestPath();
        int src;
        System.out.println("enter the source vertex");
        src=sc.nextInt();
        t.dijkstra(graph,src-1,n);
    }
}

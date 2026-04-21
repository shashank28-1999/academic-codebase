import java.util.*;
import java.lang.*;
import java.io.*;

class MSTPrim
{
    int V;

    MSTPrim(int v)
    {
        V=v;
    }

    // A utility function to find the vertex with minimum key
    // value, from the set of vertices not yet included in MST
    int minKey(int key[], Boolean mstSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;
        for(int i=0;i<V;i++)
        {
            if(mstSet[i]==false && key[i]<min)
            {
                min=key[i];
                min_index=i;
            }
        }

        //add code here......

        return min_index;
    }

    // A utility function to print the constructed MST stored in parent[]
    void printMST(int parent[], int n, int graph[][])
    {
        int tcost=0;
        System.out.println("spanning tree Edges and  Weights");
        for (int i = 1; i < V; i++)
        {
            System.out.println((parent[i]+1)+" - "+(i+1)+" "+graph[i][parent[i]]);
            tcost+=graph[i][parent[i]];
        }
        System.out.println("total cost of MST="+tcost);
    }

    // Function to construct and print MST for a graph represented
    // using adjacency matrix representation
    void primMST(int graph[][])
    {
        // Array to store constructed MST
        int parent[] = new int[V];
        int u;

        // Key values used to pick minimum weight edge in cut
        int key[] = new int [V];

        // To represent set of vertices not yet included in MST
        Boolean mstSet[] = new Boolean[V];

        // add code here according to the comments given below...........
        for(int i=0;i<V;i++)
        {
            mstSet[i]=false;
            key[i]=Integer.MAX_VALUE;
        }

        // Initialize all keys as MAX_VALUE and intialize mstSet[] as false
        key[0]=0;
        parent[0]=-1;

        for(int count=0;count<V-1;count++)
        {
            u=minKey(key,mstSet);
            mstSet[u]=true;

            for(int i=0;i<V;i++)
            {
                if(graph[u][i]!=0 && mstSet[i]==false && graph[u][i]<key[i])
                {
                    key[i]=graph[u][i];
                    parent[i]=u;
                }
            }
        }

        // Always include first 1st vertex in MST.

        // Make key 0 so that this vertex is picked as first vertex

        // First node is always root of MST

        // The MST will have V vertices

        // Pick the minimum key vertex from the set of vertices not yet included in MST

        // Add the picked vertex to the MST Set

        // Update key value and parent index of the adjacent vertices of the picked vertex.
        // Consider only those vertices which are not yet included in MST

        // graph[u][v] is non zero only for adjacent vertices of m  mstSet[v] is false for vertices not yet included in MST
        // Update the key only if graph[u][v] is smaller than key[v]

        // print the constructed MST
        printMST(parent, V, graph);
    }

    public static void main (String[] args)
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter noof vertices");
        int V=sc.nextInt();
        int graph[][] = new int[V][V];
        MSTPrim t = new MSTPrim(V);
        System.out.println("enter adjacency matrix");
        for(i=0;i<V;i++)
            for(j=0;j<V;j++)
                graph[i][j]=sc.nextInt();
        t.primMST(graph);
    }
}

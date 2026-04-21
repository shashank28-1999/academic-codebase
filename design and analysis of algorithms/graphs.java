import java.util.*;
import java.lang.*;
import java.io.*;

class Graph
{
    int V, E;
    Edge edge[];

    class Edge
    {
        int src, dest;
    };

    Graph(int v, int e)
    {
        V = v;
        E = e;
        edge = new Edge[E];
        for (int i=0; i<e; ++i)
            edge[i] = new Edge();
    }

    int find(int parent[], int i)
    {
        //add code here....
        if(parent[i]==-1){
            return i;
        }
        else{
            return find(parent,parent[i]);
        }
    }

    void Union(int parent[], int x, int y)
    {
        //add code here....
        int xsec=find(parent,x);
        int ysec=find(parent,y);
        parent[xsec]=ysec;
    }

    int isCycle( Graph graph)
    {
        int parent[] = new int[graph.V];
        for (int i=0; i<graph.V; ++i)
            parent[i]=-1;
        for(int i=0;i<graph.E;i++){
            int x=find(parent,graph.edge[i].src);
            int y=find(parent,graph.edge[i].dest);
            if(x==y){
                return 1;
            }
            else{
                graph.Union(parent,x,y);
            }
        }
        // Iterate through all edges of graph, find subset of both
        // vertices of every edge, if both subsets are same, then there is cycle in graph.

        //add code here.....

        return 0;
    }

    public static void main (String[] args)
    {
        int V, E;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter noof vertices and edges");
        V=sc.nextInt();
        E=sc.nextInt();
        Graph graph = new Graph(V+1, E);
        System.out.println("enter the edges");
        for(int i=0;i<E;i++)
        {
            graph.edge[i].src=sc.nextInt();
            graph.edge[i].dest=sc.nextInt();
        }

        if (graph.isCycle(graph)==1)
            System.out.println( "cycle" );
        else
            System.out.println( "no cycle" );
    }
}

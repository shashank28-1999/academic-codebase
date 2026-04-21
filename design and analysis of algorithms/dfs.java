import java.util.*;

class GraphDFS
{
    int V;
    LinkedList<Integer> adj[];

    GraphDFS(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[])
    {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v)
    {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }
}

class DFSTest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices:");
        int V = sc.nextInt();
        System.out.println("Enter number of edges:");
        int E = sc.nextInt();

        GraphDFS g = new GraphDFS(V);

        System.out.println("Enter each edge (source destination):");
        for (int i = 0; i < E; i++)
        {
            int src  = sc.nextInt();
            int dest = sc.nextInt();
            g.addEdge(src, dest);
        }

        System.out.println("Enter source vertex for DFS:");
        int src = sc.nextInt();

        System.out.println("DFS traversal from vertex " + src + ":");
        g.DFS(src);
    }
}

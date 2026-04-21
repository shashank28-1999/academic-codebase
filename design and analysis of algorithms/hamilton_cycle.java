import java.util.*;
class HamiltonianCycle
{
    int V;
    int path[];

    HamiltonianCycle(int n)
    {
        V= n;
    }

    /* A utility function to check if the vertex v can be
    added at index 'pos' in the Hamiltonian Cycle
    constructed so far (stored in 'path[]') */
    boolean isSafe(int v, int graph[][], int path[], int pos)
    {
        //add code here according to comments......
        if(graph[path[pos-1]][v]==0)
        {
            return false;
        }

        for(int i=0;i<pos;i++)
        {
            if(path[i]==v)
            {
                return false;
            }
        }
        /* Check if this vertex is an adjacent vertex of
        the previously added vertex. */

        /* Check if the vertex has already been included.
        This step can be optimized by creating an array
        of size V */

        return true;
    }

    /* A recursive utility function to solve hamiltonian
    cycle problem */
    boolean hamCycleUtil(int graph[][], int path[], int pos)
    {
        if(pos==V)
        {
            if(graph[path[pos-1]][0]==1)
            {
                return true;
            }
            return false;
        }
        //add code here according to comments......
        for(int i=1;i<V;i++)
        {
            if(isSafe(i,graph,path,pos))
            {
                path[pos]=i;
                if(hamCycleUtil(graph,path,pos+1))
                {
                    return true;
                }
                path[pos]=-1;
            }
        }

        /* base case: If all vertices are included in
        Hamiltonian Cycle */

        // And if there is an edge from the last included
        // vertex to the first vertex

        // Try different vertices as a next candidate in
        // Hamiltonian Cycle. We don't try for 0 as we
        // included 0 as starting point in in hamCycle()

        /* Check if this vertex can be added to Hamiltonian
        Cycle */

        /* recur to construct rest of the path */

        /* If adding vertex v doesn't lead to a solution,
        then remove it */

        /* If no vertex can be added to Hamiltonian Cycle
        constructed so far, then return false */
        return false;
    }

    /* This function solves the Hamiltonian Cycle problem using
    Backtracking. It mainly uses hamCycleUtil() to solve the
    problem. It returns false if there is no Hamiltonian Cycle
    possible, otherwise return true and prints the path.
    Please note that there may be more than one solutions,
    this function prints one of the feasible solutions. */
    int hamCycle(int graph[][])
    {
        path = new int[V];

        //add code here according to comments......
        path[0]=0;
        if(hamCycleUtil(graph,path,1)==false)
        {
            System.out.println("Solution Does Not Exist");
            return 0;
        }
        /* Let us put vertex 0 as the first vertex in the path.
        If there is a Hamiltonian Cycle, then the path can be
        started from any point of the cycle as the graph is
        undirected */
        path[0] = 0;

        printSolution(path);
        return 1;
    }

    /* A utility function to print solution */
    void printSolution(int path[])
    {
        System.out.println("Solution Exists: Following " +
                           " is one Hamiltonian Cycle");
        for (int i = 0; i < V; i++)
            System.out.print(" "+(path[i]+1)+" ");
        // Let us print the first vertex again to show the
        // complete cycle
        System.out.println((path[0]+1)+" ");
    }

    // driver program to test above function
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter noof vertices");
        int V=sc.nextInt();
        HamiltonianCycle obj=new HamiltonianCycle(V);
        int graph[][]=new int[V][V];
        System.out.println("enter adjacency matrix");
        for(int i=0;i<V;i++)
            for(int j=0;j<V;j++)
                graph[i][j]=sc.nextInt();

        obj.hamCycle(graph);
    }
}

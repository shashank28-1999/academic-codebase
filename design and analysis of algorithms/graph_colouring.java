import java.util.*;
public class Mcoloring
{
    int color[];
    final int V=4;

    /* A utility function to check if the current
    color assignment is safe for vertex v */
    boolean isSafe(int v, int graph[][], int color[],
                   int c)
    {
        int i;
        //add code here......
        for(i=0;i<V;i++)
        {
            if(graph[v][i]==1&&color[i]==c)
                return false;
        }
        return true;
    }

    /* A recursive utility function to solve m
    coloring problem */
    boolean graphColoringUtil(int graph[][], int m,
                              int color[], int v)
    {
        // add code here according to the comments......

        /* base case: If all vertices are assigned
        a color then return true */
        if(v==V)
            return true;

        /* Consider this vertex v and try different
        colors */
        for (int c = 1; c <= m; c++)
        {
            /* Check if assignment of color c to v
            is fine*/
            if(isSafe(v,graph,color,c))
            {
                color[v]=c;
                if(graphColoringUtil(graph,m,color,v+1))
                {
                    return true;
                }
                color[v]=0;
            }

            /* recur to assign colors to rest
            of the vertices */

            /* If assigning color c doesn't lead
            to a solution then remove it */
        }

        /* If no color can be assigned to this vertex
        then return false */
        return false;
    }

    /* This function solves the m Coloring problem using
    Backtracking. It mainly uses graphColoringUtil()
    to solve the problem. It returns false if the m
    colors cannot be assigned, otherwise return true
    and prints assignments of colors to all vertices.
    Please note that there may be more than one
    solutions, this function prints one of the
    feasible solutions.*/
    boolean graphColoring(int graph[][], int m)
    {
        //add code here according to the comments......

        color = new int[V];
        if(graphColoringUtil(graph,m,color,0))
        {
            printSolution(color);
            return true;
        }
        System.out.println("Solution does not exist");
        return false;

        // Call graphColoringUtil() for vertex 0

        // call printSolution() to Print the solution

        //return true;
    }

    /* A utility function to print solution */
    void printSolution(int color[])
    {
        System.out.println("Solution Exists: Following " +
                           "are the assigned colors");
        for (int i = 0; i < V; i++)
            System.out.print(color[i] + " ");
        System.out.println();
    }

    // driver program to test above function
    public static void main(String args[])
    {
        Mcoloring Coloring = new Mcoloring();
        Scanner sc=new Scanner(System.in);
        int graph[][] = new int[4][4];
        System.out.println("enter adjacency matrix of graph");
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                graph[i][j]=sc.nextInt();
        System.out.println("enter number of colors");
        int m = sc.nextInt(); // Number of colors
        Coloring.graphColoring(graph, m);
    }
}

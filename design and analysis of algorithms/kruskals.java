import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

class edgeComparator implements Comparator<Edge>
{
    public int compare(Edge e1, Edge e2)
    {
        if(e1.weight<e2.weight)
            return -1;
        if(e1.weight==e2.weight)
            return 0;
        else
            return 1;
    }
}

class Edge
{
    int source;
    int destination;
    int weight;

    public Edge(int source, int destination, int weight)
    {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

public class KruskalMST
{
    public static class Graph{

        int vertices;
        ArrayList<Edge> allEdges = new ArrayList<>();

        Graph(int vertices)
        {
            this.vertices = vertices;
        }

        public void addEgde(int source, int destination, int weight)
        {
            Edge edge = new Edge(source, destination, weight);
            allEdges.add(edge); //add to total edges
        }

        public void kruskalMST()
        {
            //create a priority queue with edge weight
            int i;
            PriorityQueue<Edge> pq=new PriorityQueue<>(new edgeComparator());
            //add all the edges to priority queue, //sort the edges on weights
            for(i=0;i<allEdges.size();i++)
            {
                pq.add(allEdges.get(i));
            }

            //create a parent []
            int [] parent = new int[vertices];

            //call makeset with parent[]
            makeSet(parent);
            ArrayList<Edge> mst = new ArrayList<>();

            //process all vertices-1 edges and remove minimum cost edge from the PriorityQueue
            int index=0;
            while(index<vertices-1)
            {
                Edge e=pq.remove();
                //check if adding this edge creates a cycle
                int x_set=find(parent,e.source);
                int y_set=find(parent,e.destination);
                if(x_set==y_set)//ignore, will create cycle
                {
                }
                else {
                    mst.add(e);
                    index++;
                    union(parent,x_set,y_set);
                    //add it to our final result
                }
            }

            //print MST
            System.out.println("Minimum Spanning Tree: ");
            printGraph(mst);
        }

        public void makeSet(int [] parent){
            //add code here for makeSet()
            int i;
            for(i=0;i<vertices;i++)
            {
                parent[i]=i;
            }
        }

        public int find(int [] parent, int vertex){

            //add code here for find()
            if(parent[vertex]==vertex)
                return vertex;
            else
                return find(parent,parent[vertex]);
        }

        public void union(int [] parent, int x, int y){

            //add code here for union()
            parent[y]=x;
        }

        public void printGraph(ArrayList<Edge> edgeList){
            for (int i = 0; i < edgeList.size() ; i++) {
                Edge edge = edgeList.get(i);
                System.out.println("Edge-" + (i+1)+ " source: " + edge.source +
                        " destination: " + edge.destination +
                        " weight: " + edge.weight);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int source,dest,weight;
        System.out.println("enter noof vertices");
        int vertices = sc.nextInt();
        Graph graph = new Graph(vertices);
        System.out.println("enter noof Edges");
        int edges=sc.nextInt();
        System.out.println("enter each edge  source,destination,weight");
        for(int i=1;i<edges;i++)
        {
            source=sc.nextInt();
            dest=sc.nextInt();
            weight=sc.nextInt();
            graph.addEgde(source, dest, weight);
        }

        graph.kruskalMST();
    }
}

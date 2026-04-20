#include<iostream>
#include <stdlib.h>
using namespace std;

class AdjListNode
{
    public:
    int dest;
    AdjListNode* next;
};

class AdjList
{
    public:
    AdjListNode *head;
};

class Graph
{
    public:
    int V;
    AdjList* array;
};

AdjListNode* newAdjListNode(int dest)
{
    AdjListNode* n=(AdjListNode*)malloc(sizeof(AdjListNode));
    n->dest=dest;
    n->next=NULL;
    return n;
    // Write code here to create a new adjacency list node
}

Graph *g=(Graph*)malloc(sizeof(Graph));
Graph* createGraph(int V)
{
    g->V=V;
    g->array=(AdjList*)malloc(V*sizeof(AdjList));
    int i;
    for(i=0;i<V;i++){
        g->array[i].head=NULL;
        return g;
    }
    // Write code here that creates a graph of V vertices
}

void addEdge(Graph* graph, int src, int dest)
{
    AdjListNode* nn=newAdjListNode(dest);
    nn->next=g->array[src].head;
    g->array[src].head=nn;
    nn=newAdjListNode(src);
    nn->next=g->array[dest].head;
    g->array[dest].head=nn;
    // Write code here to add an edge to an undirected graph
}

void printGraph(Graph* graph)
{
    int v;
    for(v=0;v<g->V;v++){
        AdjListNode*p=g->array[v].head;
        cout<<"\nAdjacency List of vertex"<<v<<"\n head";
        while(p){
            cout<<"->"<<p->dest;
            p=p->next;
        }
        cout<<endl;
    }
    //Write code here to print the adjacency list representation of graph
}

int main()
{
    int V = 5;
    Graph* graph = createGraph(V);
    addEdge(graph, 0, 1);
    addEdge(graph, 0, 4);
    addEdge(graph, 1, 2);
    addEdge(graph, 1, 3);
    addEdge(graph, 1, 4);
    addEdge(graph, 2, 3);
    addEdge(graph, 3, 4);
    printGraph(graph);
    return 0;
}

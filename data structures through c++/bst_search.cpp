#include <iostream>
#include <cstdlib>
using namespace std;

//struct Bst_node
class Node
{
    public:
    Node* left;
    Node* right;
    int data;
    Node(int x)
    {
        data=x;
        left=NULL;
        right=NULL;
    }
};

class BinarySearchTree
{
    public:
    Node* root;
    BinarySearchTree()
    {
        root = NULL;
    }
    bool isEmpty() const { return root==NULL; }
    void print_inorder();
    void inorder(Node*);
    Node* insert(Node*,int);
    int search(Node*, int);
    void bst_search();
};

//Write the code for void insert(int); here
Node* BinarySearchTree::insert(Node* par,int d)
{
    Node* temp;
    if(par==NULL && root==NULL)
    {
        temp=new Node(d);
        root=temp;
        return temp;
    }
    if(par==NULL)
    {
        temp=new Node(d);
        return temp;
    }
    if(d<par->data)
    {
        par->left=insert(par->left,d);
    }
    if(d>par->data)
    {
        par->right=insert(par->right,d);
    }
    return par;
}

void BinarySearchTree::print_inorder()
{
    inorder(root);
}

//Write code here to insert elements inorder
void BinarySearchTree::inorder(Node* par)
{
    if(par==NULL)
        return;
    inorder(par->left);
    cout<<par->data<<" ";
    inorder(par->right);
}

void BinarySearchTree::bst_search()
{
    int x;
    int flag=0;
    cout<<"Enter element to be searched ";
    cin>>x;
    flag=search(root,x);
    if(flag==1)
        cout<<"element found"<<endl;
    else
        cout<<"element not found"<<endl;
}

//Write code here to implement search operation here search(Bst_node*root, int x)
int BinarySearchTree::search(Node* par,int d)
{
    if(par->data==d)
    {
        return 1;
    }
    if(par==NULL)
    {
        return 0;
    }
    if(d<par->data)
    {
        return search(par->left,d);
    }
    if(d>par->data)
    {
        return search(par->right,d);
    }
}

int main()
{
    BinarySearchTree b;
    Node* t;
    t=b.root;
    int ch,tmp,tmp1;
    while(ch!=4)
    {
        cout<<endl<<endl;
        cout<<" Binary Search Tree Operations "<<endl;
        cout<<" --------------------------------- "<<endl;
        cout<<" 1. Insertion/Creation "<<endl;
        cout<<" 2. In-Order Traversal "<<endl;
        cout<<" 3. Search "<<endl;
        cout<<" 4. Exit "<<endl;
        cout<<" Enter your choice : ";
        cin>>ch;
        switch(ch)
        {
            case 1 : cout<<" Enter Number to be inserted : ";
                cin>>tmp;
                t=b.insert(t,tmp);
                break;
            case 2 : cout<<endl;
                cout<<" In-Order Traversal "<<endl;
                cout<<" -------------------"<<endl;
                b.print_inorder();
                break;
            case 3 : cout<<endl;
                cout<<" Search an Element "<<endl;
                cout<<" -------------------"<<endl;
                b.bst_search();
                break;
            case 4 : cout<<"exited";
                //system("pause");
                break;
        }
    }
    return 0;
}

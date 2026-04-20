#include <iostream>
#include <stdlib.h>
using namespace std;

class tree
{
    public:
    int data;
    tree *left;
    tree *right;
    tree(int val)
    {
        data = val;
        left = NULL;
        right = NULL;
    }
};

tree *recursive_delete_node(tree *root, int val)
{
    //Write code here to delete elements
    tree *t,*t1;
    int x;
    if(root==NULL)
        return NULL;
    if(val<root->data)
        root->left=recursive_delete_node(root->left,val);
    else if(val>root->data)
        root->right=recursive_delete_node(root->right,val);
    else
    {
        if((root->left==NULL)&&(root->right==NULL))
        {
            free(root);
            root=NULL;
        }
        else if(root->left==NULL)
        {
            if(root->right!=NULL)
            {
                t=root->right;
                free(root);
                root=t;
            }
        }
        else if(root->right==NULL)
        {
            if(root->left!=NULL)
            {
                t=root->left;
                free(root);
                root=t;
            }
        }
        else
        {
            t1=root->left;
            while(t1->right!=NULL)
                t1=t1->right;
            x=t1->data;
            root=recursive_delete_node(root,x);
            root->data=x;
        }
    }
    return root;
}

void print_tree(tree *root)
{
    if (root == NULL)
        return;
    print_tree(root->left);
    cout<<root->data<<" ";
    print_tree(root->right);
}

tree *recur_insert_node(tree *root, int val)
{
    //Write code here to insert elements into bst
    if(root==NULL)
    {
        root=new tree(val);
        return root;
    }
    if(root->data==val)
        cout<<"The value is already existing.Not adding "<<endl;
    else if(val<root->data)
        root->left=recur_insert_node(root->left,val);
    else
        root->right=recur_insert_node(root->right,val);
    return root;
}

int main()
{
    tree *root = NULL;
    int choice, value;

    while (1)
    {
        cout<<"BST\n1) Insert\n2) Delete\n3) Print\n4) Exit"<<endl;
        cin>>choice;

        switch(choice)
        {
            case 1:
                cout<<"Enter the value"<<endl;
                cin>>value;
                root = recur_insert_node(root, value);
                break;
            case 2:
                cout<<"Enter the value"<<endl;
                cin>>value;
                root = recursive_delete_node(root, value);
                break;
            case 3:
                print_tree(root);
                cout<<endl;
                break;
            case 4:
                cout<<"exiting"<<endl;
                exit(0);
                break;
            default:
                cout<<"Invalid input"<<endl;
        }
    }
}

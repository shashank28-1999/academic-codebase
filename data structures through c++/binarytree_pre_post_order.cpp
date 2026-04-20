#include<iostream>
using namespace std;

class Node{
    public:
    int data;
    Node *left;
    Node *right;
    Node(int x){
        data=x;
        left=NULL;
        right=NULL;
    }
};

class BinaryTree{
    public:
    Node *root;
    BinaryTree(int d){
        root=new Node(d);
    }
    Node* getRoot(){
        return root;
    }
    Node* insert(Node *pp,int d,int dir){
        Node *t=new Node(d);
        if(dir==-1){
            pp->left=t;
            return t;
        }
        else{
            pp->right=t;
            return t;
        }
    }
    void inorder(Node *np){
        if(np!=NULL){
            inorder(np->left);
            cout<<np->data<<" ";
            inorder(np->right);
            return;
        }
    }
    void preorder(Node *np){
        if(np!=NULL){
            cout<<np->data<<" ";
            preorder(np->left);
            preorder(np->right);
            return;
        }
    }
    void postorder(Node *np){
        if(np!=NULL){
            postorder(np->left);
            postorder(np->right);
            cout<<np->data<<" ";
            return;
        }
    }
};

int main(){
    BinaryTree *bt=new BinaryTree(10);
    Node *rp=bt->getRoot();
    Node *n1=bt->insert(rp,15,1);
    Node *n2=bt->insert(rp,16,2);
    Node *n3=bt->insert(n1,17,1);
    Node *n4=bt->insert(n1,13,2);
    Node *n5=bt->insert(n3,20,1);
    Node *n6=bt->insert(n3,11,2);
    Node *n7=bt->insert(n4,14,1);
    Node *n8=bt->insert(n4,18,2);
    Node *n9=bt->insert(n2,12,1);
    Node *n10=bt->insert(n2,19,2);
    bt->inorder(rp);
    cout<<endl;
    bt->preorder(rp);
    cout<<endl;
    bt->postorder(rp);
    cout<<endl;
    return 0;
}

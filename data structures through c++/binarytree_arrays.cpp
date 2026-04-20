#include<iostream>
using namespace std;

class ABinaryTree{
    int *a,size;
    public:
    ABinaryTree(int n,int r){
        size=n;
        a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=0;
        }
        a[1]=r;
    }
    int insert(int i,int x,int d){
        int j;
        if(d==1){
            j=2*i;
            a[j]=x;
            return j;
        }
        else{
            j=2*i+1;
            a[j]=x;
            return j;
        }
    }
    void inorder(int i){
        if(a[i]!=0 && i<size){
            inorder(2*i);
            cout<<a[i]<<" ";
            inorder(2*i+1);
        }
    }
    void preorder(int i){
        if(a[i]!=0 && i<size){
            cout<<a[i]<<" ";
            preorder(2*i);
            preorder(2*i+1);
        }
    }
    void postorder(int i){
        if(a[i]!=0 && i<size){
            postorder(2*i);
            postorder(2*i+1);
            cout<<a[i]<<" ";
        }
    }
};
//write required code here

int main()
{
    ABinaryTree *abt=new ABinaryTree(8,10);
    int n1=abt->insert(1,15,1);
    int n2=abt->insert(1,14,2);
    int n3=abt->insert(n1,17,1);
    int n4=abt->insert(n1,11,2);
    int n5=abt->insert(n2,8,1);
    int n6=abt->insert(n2,9,2);
    abt->inorder(1);
    cout<<endl;
    abt->preorder(1);
    cout<<endl;
    abt->postorder(1);
    cout<<endl;
    return 0;
}

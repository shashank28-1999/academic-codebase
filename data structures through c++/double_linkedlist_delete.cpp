#include<iostream>
#include<cstdlib>
using namespace std;

class Node {
    public:
    int data;
    Node *next;
    Node *prev;

    Node(int x) {
        data = x;
        next = NULL;
        prev = NULL;
    }
};

class Doublell
{
    public:
    Node *head,*tail;
    int count;
    Doublell()
    {
        head = NULL;
        tail = NULL;
        count=0;
    }
    void create(int num);
    void deleteNode(int x);
    void display_LtoR();
    void display_RtoL();
};

void Doublell::create(int num)
{
    Node *nn;
    if(head==NULL)
    {
        head=new Node(num);
        tail=head;
        count++;
    }
    else
    {
        nn=new Node(num);
        tail->next=nn;
        nn->prev=tail;
        tail=nn;
        count++;
    }
}

void Doublell::deleteNode(int x){
    Node *p,*t,*q;
    if(head==NULL){
        cout<<"List is empty"<<endl;
        return;
    }
    if(head->data==x && tail->data==x){
        Node *n=head;
        head=NULL;
        tail=NULL;
        delete n;
        cout<<x<<" is deleted"<<endl;
        return;
    }
    if(head->data==x){
        p=head;
        head=head->next;
        head->prev=NULL;
        delete p;
        cout<<x<<" is deleted"<<endl;
        return;
    }
    if(tail->data==x){
        p=tail;
        tail=tail->prev;
        tail->next=NULL;
        delete p;
        cout<<x<<" is deleted"<<endl;
        return;
    }
    for(t=head;t->next!=NULL && t->next->data!=x;t=t->next);
    if(t->next==NULL){
        cout<<x<<" not found"<<endl;
        return;
    }
    q=t->next;
    t->next=t->next->next;
    t->next->prev=t;
    cout<<x<<" is deleted"<<endl;
    delete q;
    return;
}

void Doublell::display_LtoR(){
    Node *t;
    if(head==NULL && tail==NULL){
        cout<<"List is empty"<<endl;
        return;
    }
    for(t=head;t!=NULL;t=t->next){
        cout<<t->data<<" ";
    }
    cout<<endl;
}

void Doublell::display_RtoL(){
    Node *t;
    if(head==NULL && tail==NULL){
        cout<<"List is empty"<<endl;
        return;
    }
    for(t=tail;t!=NULL;t=t->prev){
        cout<<t->data<<" ";
    }
    cout<<endl;
}

int main()
{
    Doublell l;
    int num,ch;
    do
    {
        cout<<"\n1. Create"<<endl;
        cout<<"2. Delete a node"<<endl;
        cout<<"3. Display left to right"<<endl;
        cout<<"4. Display right to left"<<endl;
        cout<<"5. Exit"<<endl;
        cout<<"Enter your choice:";
        cin>>ch;
        switch(ch)
        {
            case 1:
                cout<<"Enter data to create nodes & press '0' to exit: ";
                do{
                    cin>>num;
                    if(num==0) break;
                    l.create(num);
                }while(1);
                break;
            case 2:
                cout<<"Enter data: ";
                cin>>num;
                l.deleteNode(num);
                break;
            case 3:
                l.display_LtoR();
                break;
            case 4:
                l.display_RtoL();
                break;
            case 5:
                cout<<"Exiting\n";
                exit(0);
            default:
                cout<<"Wrong Choice\n";
        }
    }while(1);
}

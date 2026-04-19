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
    void insertAfterPos(int num,int pos);
    void display_left();
    void display_right();
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

void Doublell::insertAfterPos(int num,int pos){
    Node *t;
    int i;
    if(count==0&&pos==1){
        head=new Node(num);
        tail=head;
        count++;
        cout<<"Creating the list with head node"<<endl;
        return;
    }
    if(pos>count || pos<=0){
        cout<<"Position not found";
        return;
    }
    else{
        for(t=head,i=1;i<pos;t=t->next,i++);
        Node *q=new Node(num);
        q->next=t->next;
        q->prev=t;
        t->next=q;
        t->next->prev=q;
        count++;
        return;
    }
}

void Doublell::display_left(){
    Node *t;
    if(head==NULL){
        cout<<"List is empty"<<endl;
    }
    else{
        for(t=head;t!=NULL;t=t->next){
            cout<<t->data<<" ";
        }
    }
}

void Doublell::display_right(){
    Node *t;
    if(head==NULL && tail==NULL){
        cout<<"List is empty"<<endl;
    }
    else{
        for(t=tail;t!=NULL;t=t->prev){
            cout<<t->data<<" ";
        }
    }
}

int main()
{
    Doublell l;
    int num,ch,pos;
    do
    {
        cout<<"\n1. Create"<<endl;
        cout<<"2. Insert after position"<<endl;
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
                cout<<"Enter data and position: ";
                cin>>num>>pos;
                l.insertAfterPos(num,pos);
                break;
            case 3:
                l.display_left();
                break;
            case 4:
                l.display_right();
                break;
            case 5:
                cout<<"Exiting\n";
                exit(0);
            default:
                cout<<"Wrong Choice\n";
        }
    }while(1);
}

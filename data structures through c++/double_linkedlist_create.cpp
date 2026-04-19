#include<iostream>
#include<cstdlib>
using namespace std;

class Node {
    public:
    int data;
    Node *next;
    Node *prev;
    public:

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
    void display_left();
    void display_right();
};

void Doublell::create(int num){
    Node *t;
    if(head==NULL){
        head=new Node(num);
        return;
    }
    for(t=head;t->next!=NULL;t=t->next);
    Node *p=new Node(num);
    t->next=p;
    p->prev=t;
    tail=p;
    return;
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

void Doublell::display_left(){
    Node *t;
    if(head==NULL && tail==NULL){
        cout<<"List is empty"<<endl;
    }
    else{
        for(t=head;t!=NULL;t=t->next){
            cout<<t->data<<" ";
        }
    }
}
//write code for all functions here

int main()
{
    Doublell l;
    int num,ch;
    do
    {
        cout<<"\n1. Create"<<endl;
        cout<<"2. Display from left to right"<<endl;
        cout<<"3. Display from right to left"<<endl;
        cout<<"4. Exit"<<endl;
        cout<<"Enter your choice:";
        cin>>ch;
        switch(ch)
        {
            case 1:
                cout<<"Enter data to create nodes & press '0' to exit: ";
                do{
                    cin>>num;
                    if(num==0)
                        break;
                    l.create(num);
                }while(1);
                break;
            case 2:
                l.display_left();
                break;
            case 3:
                l.display_right();
                break;
            case 4:
                cout<<"Exiting\n";
                exit(0);
                break;
            default:
                cout<<"Wrong Choice\n";
        }
    }while(1);
}

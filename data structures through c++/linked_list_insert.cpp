#include<iostream>
#include<cstdlib>
using namespace std;

class node{
    public:
    int data;
    node* next;
    node(){
        next=NULL;
    }
    node(int x){
        data=x;
    }
    /*create a class node here, declare required variables data of type integer
    to store element & variable next to point to next node
    -use node(), to initialize default values of node
    -use node(int x), to create new node */
};

class LinkedList {
    public:
    node* head,*tail;
    LinkedList() {
        head = NULL;
        tail = NULL;
    }
    void addFront(int);
    void addRear(int);
    void display();
};
void LinkedList::addFront(int a){
    node *p;
    p=new node(a);
    if(head==NULL && tail==NULL){
        head=p;
        tail=p;
    }
    p->next=head;
    head=p;
}
void LinkedList::addRear(int a){
    node *q;
    q=new node(a);
    if(head==NULL && tail==NULL){
        head=q;
        tail=q;
    }
    tail->next=q;
    tail=tail->next;
}
void LinkedList::display(){
    node *temp;
    for(temp=head;temp!=NULL;temp=temp->next){
        cout<<temp->data<<" ";
    }
}
//write logic for all functions here

int main()
{
    LinkedList l;
    node *temp;
    int num,nd,ch=1,ele;
    while(ch!=4)
    {
        cout<<"1. Insert node at front."<<endl;
        cout<<"2. Insert node at rear."<<endl;
        cout<<"3. Display"<<endl;
        cout<<"4. Exit"<<endl;
        cout<<"Enter your choice: ";
        cin>>ch;
        switch(ch)
        {
            case 1:
                cout<<"Enter data: ";
                cin>>num;
                l.addFront(num);
                break;
            case 2:
                cout<<"Enter data: ";
                cin>>num;
                l.addRear(num);
                break;
            case 3:
                l.display();
                break;
            case 4:
                cout<<"exiting\n";
                break;
            default:
                cout<<"Wrong Choice\n";
        }
    }
}

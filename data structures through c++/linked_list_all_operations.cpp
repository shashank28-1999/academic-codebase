#include<iostream>
#include<cstdlib>
using namespace std;

/*
create a class node, declare required variables to store element & address
use node(), to initialize default values of node
use node(int x), to create new node
*/
class Node{
    public:
    int data;
    Node *next;
    Node(){
        next=NULL;
        data=0;
    }
    Node(int m){
        data=m;
        next=NULL;
    }
};

class LinkedList {
    public:
    Node *head;
    int count;
    LinkedList() {
        head = NULL;
        count=0;
    }
    void addAfterPos(int num,int pos);
    void search(int k);
    void deleteNode(int x);
    void display();
};

void LinkedList::addAfterPos(int num,int pos){
    Node *nn=new Node(num);
    if(pos==1 && head==NULL){
        cout<<"Creating the list with head node"<<endl;
        head=nn;
        head->next=NULL;
        return;
    }
    Node *temp=head;
    for(int i=1;i!=pos && temp!=NULL;temp=temp->next){
        i++;
    }
    if(temp!=NULL){
        Node *t= temp->next;
        temp->next=nn;
        nn->next=t;
        return;
    }
    else{
        cout<<"Position not found"<<endl;
    }
}

void LinkedList::display(){
    if(head==NULL){
        cout<<"List is empty"<<endl;
        return;
    }
    else{
        Node *d;
        for(d=head;d!=NULL;d=d->next){
            cout<<d->data<<" ";
        }
        cout<<endl;}
}

void LinkedList::search(int k){
    if(head==NULL){
        cout<<"List is empty"<<endl;
        return;
    }
    else {
        Node *temp;
        for(temp=head;temp!=NULL;temp=temp->next){
            if(temp->data==k){
                cout<<"Element found "<<k<<endl;
                return;
            }
        }
        if(temp==NULL)
            cout<<"Element not found "<<k<<endl;
    }
}

void LinkedList::deleteNode(int x){
    if(head==NULL){
        cout<<"List is empty"<<endl;
        return;
    }
    Node *temp;
    if(head->data==x){
        head=head->next;
        cout<<x<<" is deleted"<<endl;
        return;
    }
    for(temp=head;temp->next!=NULL;temp=temp->next){
        if(temp->next->data==x){
            temp->next=temp->next->next;
            cout<<x<<" is deleted"<<endl;
            return;
        }
    }
    if(temp->next==NULL){
        cout<<x<<" not found"<<endl;
        return;
    }
}
//Write logic for all functions here following the instructions specified

int main()
{
    LinkedList l;
    int num,pos,ch=1;
    while(ch!=5)
    {
        cout<<"\n1. Insert after position"<<endl;
        cout<<"2. Search"<<endl;
        cout<<"3. Delete"<<endl;
        cout<<"4. Display"<<endl;
        cout<<"5. Exit"<<endl;
        cout<<"Enter your choice:";
        cin>>ch;
        switch(ch)
        {
            case 1:
                cout<<"Enter data and position: ";
                cin>>num>>pos;
                l.addAfterPos(num,pos);
                break;
            case 2:
                cout<<"Enter element to search: ";
                cin>>num;
                l.search(num);
                break;
            case 3:
                cout<<"Enter element to delete: ";
                cin>>num;
                l.deleteNode(num);
                break;
            case 4:
                l.display();
                break;
            case 5:
                cout<<"Exiting\n";
                break;
            default:
                cout<<"Wrong Choice\n";
        }
    }
}

#include<iostream>
#include<cstdlib>
using namespace std;

class Node {
    public:
    int data;
    Node* next;
    public:
    Node() {
        data = 0;
        next = NULL;
    }
    Node(int x) {
        data = x;
        next = NULL;
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
    void create(int num);
    void display();
    void deleteNode(int x);
};

void LinkedList::create(int num)
{
    Node *temp,*nn;
    if(head==NULL)
    {
        head=new Node(num);
        count++;
    }
    else
    {
        for(temp=head;temp->next!=NULL;temp=temp->next);
        nn=new Node(num);
        temp->next=nn;
        count++;
    }
}

//Write code to delete a node in list by following the specifications mentioned above
void LinkedList::deleteNode(int num){
    Node *temp,*p,*q;
    if(head==NULL){
        cout<<"List is empty"<<endl;
        return;
    }
    if(head->data==num){
        p=head;
        head=head->next;
        delete p;
        cout<<num<<" is deleted"<<endl;
        return;
    }
    for(temp=head;temp->next!=NULL && temp->next->data!=num;temp=temp->next){
        if(temp->next==NULL){
            cout<<num<<" not found"<<endl;
            return;
        }
    }
    q=temp->next;
    temp->next=temp->next->next;
    delete q;
    cout<<num<<" is deleted"<<endl;
    return;
}

void LinkedList::display(){
    Node *temp;
    if(head==NULL){
        cout<<"List is empty"<<endl;
    }
    for(temp=head;temp!=NULL;temp=temp->next){
        cout<<temp->data<<" ";
    }
    cout<<endl;
}

int main()
{
    LinkedList l;
    Node *temp;
    int num,pos,ch=1;
    while(ch!=4)
    {
        cout<<"\n1. Create"<<endl;
        cout<<"2. Delete a Node"<<endl;
        cout<<"3. Display"<<endl;
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
            cout<<"Enter data: ";
            cin>>num;
            l.deleteNode(num);
            break;
            case 3:
            l.display();
            break;
            case 4:
            cout<<"Exiting\n";
            break;
            default:
            cout<<"Wrong Choice\n";
        }
    }
}

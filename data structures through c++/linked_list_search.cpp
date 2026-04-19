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
    void search(int k);
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

//Write code to search an element by following the specifications mentioned above
void LinkedList::search(int k){
    Node *p;
    if(head==NULL){
        cout<<"List is empty"<<endl;
        return;
    }
    for(p=head;p!=NULL;p=p->next){
        if(p->data==k){
            cout<<"Element found "<<k<<endl;
            return;
        }
    }
    cout<<"Element not found "<<k<<endl;
    return;
}

void LinkedList::display(){
    Node *t;
    if(head==NULL){
        cout<<"List is empty"<<endl;
    }
    for(t=head;t!=NULL;t=t->next){
        cout<<t->data<<" ";
    }
    cout<<endl;
}
//write code display the list by following the specifications mentioned above

int main()
{
    LinkedList l;
    Node *temp;
    int num,pos,ch=1;
    while(ch!=4)
    {
        cout<<"\n1. Create"<<endl;
        cout<<"2. Search an element in list"<<endl;
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
            cout<<"Enter num: ";
            cin>>num;
            l.search(num);
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

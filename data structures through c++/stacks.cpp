#include<iostream>
using namespace std;

class Node{
    public:
    int data;
    Node *next;
    //declare variables to create node with fields data and address

    Node(int x){
        data=x;
        next=NULL;
        //assign values to variables
    }
};

class Stack{
    Node *top,*tail;
    public:
    Stack(){
        top=NULL;
        tail=NULL;
    }
    void push(int x);
    void pop();
    int getTop();
    void display();
};

void Stack::push(int x){
    Node *p;
    p=new Node(x);
    if(top==NULL && tail==NULL){
        top=p;
        tail=p;
    }
    top->next=p;
    top=p;
}
//Write code here to insert node into stack using push()

void Stack::pop(){
    Node *p=NULL,*t;
    int d;
    if(tail==NULL){
        cout<<"Stack is empty"<<endl;
        return;
    }
    if(top==tail){
        d=tail->data;
        cout<<"Popped value is "<<d<<endl;
        delete tail;
        tail=NULL;
        top=NULL;
        return;
    }
    for(t=tail;t->next!=NULL;t=t->next){
        p=t;
    }
    d=top->data;
    top=p;
    p->next=NULL;
    cout<<"Popped value is "<<d<<endl;
    delete t;
}
//Write code here to delete node from stack using pop()

int Stack::getTop(){
    Node *p=NULL,*t;
    int d;
    if(tail==NULL){
        return 0;
    }
    for(t=tail;t->next!=NULL;t=t->next){
        p=t;
    }
    d=top->data;
    return d;
}
//Write code to display topmost element of stack using getTop()

void Stack::display(){
    Node *t;
    if(tail==NULL){
        cout<<"Stack is empty"<<endl;
    }
    for(t=tail;t!=NULL;t=t->next){
        cout<<t->data<<endl;
    }
}
//Write code here to display all the nodes of stack

int main()
{
    Stack s;
    int ch,num;
    while(ch!=5)
    {
        cout<<"1. Push ";
        cout<<"2. Pop ";
        cout<<"3. Get top most element ";
        cout<<"4. Display ";
        cout<<"5. Exit"<<endl;
        cout<<"Enter choice"<<endl;
        cin>>ch;
        switch(ch)
        {
            case 1: cout<<"Enter data ";
                cin>>num;
                s.push(num);
                break;
            case 2:s.pop();
                break;
            case 3:num=s.getTop();
                if(num==0)
                    cout<<"Stack is empty"<<endl;
                else
                    cout<<"Top most element is "<<num<<endl;
                break;
            case 4:s.display();
                break;
            case 5:cout<<"Exiting";
                break;
            default:
                cout<<"Wrong choice"<<endl;
        }
    }
    return 0;
}

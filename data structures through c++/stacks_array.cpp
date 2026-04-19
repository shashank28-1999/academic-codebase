#include<iostream>
using namespace std;
#define MAX 5

class Stack_Array{
    int s[MAX],top;
    public:
    Stack_Array();
    void push(int x);
    void pop();
    int getTop();
    void display_pushorder();
    void display_poporder();
};

Stack_Array::Stack_Array(){
    top=-1;
}

void Stack_Array::push(int x){
    if(top<MAX-1){
        s[top+1]=x;
        top++;
        cout<<x<<" has been inserted";
    }
    else{
        cout<<"Stack overflow"<<endl;
    }
}

void Stack_Array::pop(){
    int t;
    if(top==-1){
        cout<<"Stack underflow"<<endl;
    }
    else{
        t=s[top];
        top=top-1;
        cout<<t<<" has been deleted"<<endl;
    }
}

int Stack_Array::getTop(){
    int t;
    if(top==-1){
        return top;
    }
    else{
        t=s[top];
        return t;
    }
}

void Stack_Array::display_pushorder(){
    int i;
    if(top==-1){
        cout<<"Stack underflow"<<endl;
        return;
    }
    else{
        for(i=0;i<=top;i++){
            cout<<s[i]<<endl;
        }
    }
}

void Stack_Array::display_poporder(){
    int i;
    if(top==-1){
        cout<<"Stack underflow"<<endl;
        return;
    }
    else{
        for(i=top;i>=0;i--){
            cout<<s[i]<<endl;
        }
    }
}
// use constructor to intitialize the top value to -1
/*Write the required code to implement the logic for all the functions
  by following the specifications mentioned above
*/

int main()
{
    Stack_Array s;
    int ch,num;
    while(ch!=6)
    {
        cout<<"\n1. Push ";
        cout<<"2. Pop ";
        cout<<"3. Get top most element ";
        cout<<"4. Display in push order ";
        cout<<"5. Display in pop order ";
        cout<<"6. Exit"<<endl;
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
                if(num==-1)
                    cout<<"Stack underflow"<<endl;
                else
                    cout<<"Top most element is "<<num<<endl;
                break;
            case 4:s.display_pushorder();
                break;
            case 5:s.display_poporder();
                break;
            case 6:cout<<"Exiting"<<endl;
                break;
            default:
                cout<<"Wrong choice"<<endl;
        }
    }
    return 0;
}

#include<iostream>
using namespace std;

template<class T>
class Stack_Array{
    T *s;
    int top,max;
    public:
    Stack_Array(int);
    void push(T x);
    void pop();
    int getTop();
    void display_pushorder();
    void display_poporder();
};

template<class T>
Stack_Array<T>::Stack_Array(int size){
    top=-1;
    max=size;
    s=new T[max];
}

template<class T>
void Stack_Array<T>::push(T x){
    if(top==max-1){
        cout<<"Stack overflow"<<endl;
        return;
    }
    top++;
    s[top]=x;
    cout<<x<<" has been inserted"<<endl;
}

template<class T>
void Stack_Array<T>::pop(){
    T temp;
    if(top==-1){
        cout<<"Stack underflow"<<endl;
        return;
    }
    temp=s[top];
    top--;
    cout<<temp<<" has been deleted"<<endl;
}

template<class T>
int Stack_Array<T>::getTop(){
    if(top==-1)
        return top;
    else return s[top];
}

template<class T>
void Stack_Array<T>::display_pushorder(){
    int i;
    if(top==-1){
        cout<<"Stack underflow"<<endl;
        return;
    }
    for(i=0;i<=top;i++){
        cout<<s[i]<<endl;
    }
}

template<class T>
void Stack_Array<T>::display_poporder(){
    int i;
    if(top==-1){
        cout<<"Stack underflow"<<endl;
        return;
    }
    for(i=top;i>=0;i--){
        cout<<s[i]<<endl;
    }
}
//write code here

int main()
{
    int ch,size,num;
    cout<<"Enter size of array"<<endl;
    cin>>size;
    Stack_Array<int> s(size);
    do
    {
        cout<<"\n1. Push ";
        cout<<"2. Pop ";
        cout<<"3. Got top most element ";
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
    }while(ch!=6);
    return 0;
}

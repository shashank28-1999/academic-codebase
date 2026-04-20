#include<iostream>
using namespace std;

/*
Declare the class template for stack and perform all required operations
in it to perform required logic
*/

template<class T>
class Expression
{
    public:
    char *infx,*pofx,ch,elem;
    T *t;
    int stsize,j,count,top;
    char *str;
    Expression(int size)
    {
        stsize=size;
        j=0;
        t=new T[20];
        t[0]='#';
        top=0;
        infx=new char[size];
        pofx=new char[size];
        str=new char[size];
        count=0;
        cout<<"read the infix expression ? ";
        cin>>infx;
    }
    /*
    use convert() to convert infix expression to postfix expression
    and use int prec(char elem) to find precendence of operators
    */

    /*
    use int calculatePostfix() to evaluate postfix expression and
    use int operation(int a,int b,char opr) to perform required arthematic operations
    */
    void convert();
    int prec(char elem);
    void push(T ele);
    void pop();
    int calculatePostfix();
    int operation(int a,int b,char opr);
};

template<class T>
void Expression<T>::convert()
{
    int p,i;
    for(i=0;infx[i]!='\0';i++)
    {
        if(infx[i]=='+'||infx[i]=='-'||infx[i]=='*'||infx[i]=='/')
        {
            if(prec(infx[i])>prec(t[top]))
            {
                push(infx[i]);
            }
            if(prec(infx[i])<prec(t[top]))
            {
                pop();
                push(infx[i]);
            }
        }
        else
        {
            pofx[j]=infx[i];
            j++;
        }
        count++;
    }
    if(count==i)
    {
        for(i=top;i>0;i--)
        {
            pop();
        }
    }
    cout<<infx<<endl;
    cout<<pofx<<endl;
    top=-1;
}

template<class T>
int Expression<T>::prec(char elem)
{
    if(elem=='#')
    {
        return 1;
    }
    if(elem=='+'||elem=='-')
    {
        return 2;
    }
    if(elem=='*'||elem=='/')
    {
        return 3;
    }
}

template<class T>
void Expression<T>::push(T ele)
{
    top++;
    t[top]=ele;
}

template<class T>
void Expression<T>::pop()
{
    pofx[j]=t[top];
    top--;
    j++;
}

template<class T>
int Expression<T>::calculatePostfix()
{
    int i;
    int x,y,r,c1=0;
    char c;
    for(i=0;str[i]!='\0';i++)
    {
        if(str[i]=='+'||str[i]=='-'||str[i]=='*'||str[i]=='/')
        {
            x=t[top]-48;
            pop();
            y=t[top]-48;
            pop();
            r = operation(x,y,str[i]);
            push(r+48);
        }
        else
        {
            push(str[i]);
        }
        c1++;
    }
    return r;
}

template<class T>
int Expression<T>::operation(int a,int b,char opr)
{
    if(opr=='+')
    {
        return b+a;
    }
    if(opr=='-')
    {
        return b-a;
    }
    if(opr=='*')
    {
        return b*a;
    }
    if(opr=='/')
    {
        return b/a;
    }
}

int main()
{
    int size,i;
    char val;
    cout<<"enter size of the string"<<endl;
    cin>>size;
    Expression<char> e(size);
    e.convert();
    for(i=0;e.pofx[i]!='\0';i++)
    {
        if(isalpha(e.pofx[i]))
        {
            cout<<"Enter the value for "<<e.pofx[i];
            cin>>val;
            e.str[i]=val;
        }
        else
            e.str[i]=e.pofx[i];
    }
    int result = e.calculatePostfix();
    cout << "the result is " << result<<endl;
    return 0;
}

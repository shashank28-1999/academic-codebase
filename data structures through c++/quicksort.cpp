#include <iostream>
#include<iomanip>
using namespace std;

template <class T>
class Array
{
    public:
    T *arr ;
    int size ;
    public :
    Array(int n) ;
    void input() ;
    void quicksort( T *a, int lower, int upper ) ;
    int split ( T *a, int lower, int upper );
    void display( ) ;
    ~Array()
    {
        delete arr;
    }
};

template <class T>
Array<T>:: Array(int n)
{
    size=n;
    arr=new T[n];
}

template <class T>
void Array<T> ::input()
{
    int i;
    for(i=0;i<size;i++)
        cin>>arr[i];
}

template <class T>
void Array<T> :: quicksort(T a[],int lower,int upper )
{
    int j;
    if( lower<upper )
    {
        j=split(a,lower,upper);
        quicksort(a,lower,j-1);
        quicksort(a,j+1,upper );
    }
}

template <class T>
int Array<T> :: split ( T a[], int lower, int upper )
{
    T num=a[lower];
    int i=lower+1;
    int j=upper;
    T t;
    while( 1 )
    {
        while( i<upper && num>a[i] )
            i++;
        while( num<a[j] )
            j--;
        if( i<j )
        {
            t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        else
        {
            t=a[lower];
            a[lower]=a[j];
            a[j]=t;
            return(j);
        }
    }
}

template <class T>
void Array<T> :: display( )
{
    for ( int i = 0 ; i < size ; i++ )
        cout << arr[i] << "\t" ;
    cout << endl ;
}

int main( )
{
    int n,ch;
    cout<<"Enter size"<<endl;
    cin>>n;
    Array<int>a(n);
    Array<double>f(n);
    do
    {
        cout<<"1. To Perform integer values sorting\n";
        cout<<"2. To Perform floating values sorting\n";
        cout<<"3.Exit\n";
        cout<<"Enter your choice\n";
        cin>>ch;
        switch(ch)
        {
            case 1:
                cout<<"Enter array elements"<<endl;
                a.input();
                cout << "\nQuick sort " ;
                cout << "\nArray before sorting:" << endl ;
                a.display() ;
                a.quicksort(a.arr,0,n-1) ;
                cout << "\nArray after Quick sorting:" << endl ;
                a.display() ;
                break;
            case 2:
                cout<<"Enter array elements"<<endl;
                f.input();
                cout << "\nQuick sort\n" ;
                cout << "\nArray before sorting:" << endl ;
                f.display() ;
                f.quicksort(f.arr,0,n-1) ;
                cout << "\nArray after Quick sorting:" << endl ;
                f.display() ;
                break;
            case 3: cout<<"Exiting\n";
                break;
            default: cout<<"invalid choice\n";
                break;
        }
    }while(ch!=3);
    return 0;
}

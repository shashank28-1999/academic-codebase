#include<iostream>
using namespace std;

class Array{
    int *arr;
    int size ;
    public :
    Array(int n) ;
    void input() ;
    void insertionsort() ;
    void display( ) ;
    ~Array()
    {
        delete arr;
    }
};

//Write required code here
Array::Array(int n){
    size=n;
    arr=new int[size];
}

void Array::input(){
    for(int i=0;i<size;i++){
        cin>>arr[i];
    }
}

void Array::insertionsort(){
    int i,j,k;
    for(i=0;i<size;i++){
        k=arr[i];
        j=i-1;
        while(j>=0 && arr[j]>k){
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=k;
    }
}

void Array::display(){
    for(int i=0;i<size;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

int main( )
{
    int n;
    cout<<"Enter size"<<endl;
    cin>>n;
    Array a(n);
    cout<<"Enter array elements"<<endl;
    a.input();
    cout << "\nInsertion sort\n" ;
    cout << "\nArray before sorting:" << endl ;
    a.display( ) ;
    cout<<endl;
    a.insertionsort( ) ;
    cout << "\nArray after insertion sorting:" << endl ;
    a.display();
}

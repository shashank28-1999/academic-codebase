#include <iostream>
using namespace std;

class BinarySearch
{
    private :
    int *arr ;
    int size ;
    public :
    BinarySearch(int n) ;
    void input() ;
    void search(int num,int beg,int end) ;
    ~BinarySearch()
    {
        delete[] arr;
    }
};

BinarySearch::BinarySearch(int n){
    size=n;
    arr=new int[size];
}

void BinarySearch::input(){
    for(int i=0;i<size;i++){
        cin>>arr[i];
    }
}

void BinarySearch::search(int num,int beg,int end){
    int mid;
    mid=(beg+end)/2;
    if(beg<end){
        if(arr[mid]==num){
            cout<<"Element found"<<endl;
        }
        if(arr[mid]<num){
            search(num,mid+1,end);
        }
        if(arr[mid]>num){
            search(num,beg,mid-1);
        }
    }
    else{
        cout<<"Element not found"<<endl;
    }
}
//Write required code here

int main( )
{
    int n,ele,big,end;
    cout<<"Enter size"<<endl;
    cin>>n;
    BinarySearch a(n);
    cout<<"Enter array elements in sorted order"<<endl;
    a.input();
    cout<<"Enter element to be searched in array:"<<endl;
    cin>>ele;
    a.search(ele,0,n-1) ;
}

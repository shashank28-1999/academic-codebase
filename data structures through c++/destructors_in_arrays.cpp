#include<iostream>
using namespace std;
class Arr
{
    private:
        int size;
        int *ptr;
    public:
        Arr(int s); //implement constructor to create array using new keyword with pointer ptr and size
        void input(); //write function to read elements to array
        void multiply();  //write logic to multiply all elements and display result
        ~Arr(); //delete ptr and display o/p mentioned
};
Arr::Arr(int s){
    size=s;
    ptr=new int[s];
    cout<<"Constructor called"<<endl;
}
void Arr::input(){
    cout<<"Enter array elements :"<<endl;
    for(int i=0;i<size;i++){
        cin>>ptr[i];
    }
}
void Arr::multiply(){
    int mul=1;
    for(int i=0;i<size;i++){
        mul=mul*ptr[i];
    }
    cout<<"result:"<<mul<<endl;
}
Arr::~Arr(){
    delete[] ptr;
    cout<<"Destructor called"<<endl;
}
//write required code here

int main()
{
    int range;
    cout<<"Enter size of array :";
    cin>>range;
    Arr s(range);
    s.input();
    s.multiply();
}

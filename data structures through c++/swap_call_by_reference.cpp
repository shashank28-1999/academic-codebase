#include<iostream>
using namespace std;
class Swap{
    public:
    void swap(int *n,int *m){
        int t;
        t=*n;
        *n=*m;
        *m=t;
    }
};
int main(){
    Swap s;
    int a,b,*c,*d;
    cin>>a>>b;
    c=&a;
    d=&b;
    s.swap(c,d);
    cout<<a<<" "<<b<<endl;
    return 0;
}

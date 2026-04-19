#include<iostream>
#include<string.h>
using namespace std;
class Test{
    public:
    void display(char *s);
    void display(char *s,char *q);
};
void Test::display(char *s){
    int l=strlen(s);
    cout<<l<<endl;
}
void Test::display(char *s,char *q){
    strcat(s,q);
    cout<<s<<endl;
}
int main(){
    char a[100];
    char b[100];
    cin.getline(a,99);
    cin.getline(b,99);
    Test t;
    t.display(a);
    t.display(a,b);
    return 0;
}

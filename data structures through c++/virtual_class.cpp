#include<iostream>
using namespace std;
class First{
    public:
    char name[20],course[20];
    virtual void insert()=0;
    virtual void calculate()=0;
    virtual void show()=0;
};
class Second:public First{
    int afee,tfee,rank,tofee;
    void insert(){
        cin>>name;
        cin>>course;
        cin>>afee;
        cin>>tfee;
        cin>>rank;
    }

    void calculate(){
        if(rank<10000){
            tofee=afee+tfee-5000;
        }
        else {
            tofee=afee+tfee-1000;
        }
    }
    void show(){
        cout<<name<<endl;
        cout<<course<<endl;
        cout<<tofee<<endl;
    }
};
int main(){
    First *f=new Second();
    f->insert();
    f->calculate();
    f->show();
    return 0;
}

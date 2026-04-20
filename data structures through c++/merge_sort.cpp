#include<iostream>
#include<malloc.h>
using namespace std;

class MSort{
public:
    int *arr;
    int size;
    MSort(){
    }
    int *merge(int a1[],int a2[],int m,int n){
        int *res=(int *)malloc(sizeof(int)*(m+n));
        int i1=0,i2=0;
        int count=0;
        while(i1<=m-1 && i2<=n-1){
            if(a1[i1]<a2[i2]){
                res[count]=a1[i1];
                i1++;
                count++;
            }
            else{
                res[count]=a2[i2];
                i2++;
                count++;
            }
        }
        if(i1==m){
            while(i2<=n-1){
                res[count]=a2[i2];
                count++;
                i2++;
            }
        }
        else{
            while(i1<=m-1){
                res[count]=a1[i1];
                count++;
                i1++;
            }
        }
        return res;
    }
    //Write required code here
};

int main()
{
    int one[4];
    one[0]=1;one[1]=7;one[2]=11;one[3]=14;
    int two[5];
    two[0]=3;two[1]=13;two[2]=18;two[3]=20;two[4]=25;
    MSort *ms=new MSort();
    int *r=ms->merge(one,two,4,5);
    for(int i=0;i<9;i++)
        cout<<r[i]<<" ";
    cout<<endl;
}

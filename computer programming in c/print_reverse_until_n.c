#include<stdio.h>
#include<stdlib.h>
struct node{
    int x;
    struct node *next;
};
int n,i,a,r;
struct node *hptr;
void createnode(int a){
    struct node *nn;
    nn=(struct node *)malloc(sizeof(struct node));
    nn->x=a;
    nn->next=hptr;
    hptr=nn;
}
void printreverse(int a){
    if(a>n){
        printf("INVALID");
    }
    else{
        struct node *t=hptr;
        struct node *i;
        int j=0;
        for(i=hptr;i!=NULL && j<a;i=i->next){
            printf("%d ",i->x);
            j++;
        }
    }
}
void main(){
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a);
        createnode(a);
    }
    scanf("%d",&r);
    printreverse(r);
}

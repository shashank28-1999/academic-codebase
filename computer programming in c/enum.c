#include <stdio.h>

enum days{
    sunday=1,
    monday=2,
    tuesday=3,
    wednesday=4,
    thursday=5,
    friday=6,
    saturday=7
}; //declare enumerated datatype to represent weekdays containing elements

void main()
{
    enum days d;
    //declare variable for enumeration
    int n;
    //declare an integer variable to read choice
    scanf("%d",&n);
    //based on the choice entered, display the day of the week using switch
    switch(n){
        case 1:printf("sunday");
        break;
        case 2:printf("monday");
        break;
        case 3:printf("tuesday");
        break;
        case 4:printf("wednesday");
        break;
        case 5:printf("thursday");
        break;
        case 6:printf("friday");
        break;
        case 7:printf("saturday");
        break;
        default:printf("enter valid options between 1-7");
        break;
    }
}

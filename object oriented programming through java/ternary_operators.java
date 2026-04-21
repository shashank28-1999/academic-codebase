/*Write a Program to find the greatest of 3 numbers using Ternary Operators
given numbers:
10 15 1
Output
15

Note: take these three numbers (10 15 1) to find the greatest number
*/

class Test{
    public static void main(String args[]){
        int a=10;
        int b=15;
        int c=1;
        int big=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(big);
    }
}

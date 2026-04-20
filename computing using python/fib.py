'''Write a program to Print Fibonacci Series using recursion !!

Sample I/O
Enter the Size of Series (< 20): 10
1 1 2 3 5 8 13 21 34 55

'''
'''def fib(n,m,k):
    if k>0:
        print m,
        fib(m,m+n,k-1)'''
b=int(input("Enter the Size of Series (< 20): "))
#fib(0,1,b)
n=0
m=1
a=0
def fib(k):
    if k>0:
        global m
        global n
        global a
        a=m+n
        print(m,end=" ")
        n=m
        m=a
        fib(k-1)
fib(b)

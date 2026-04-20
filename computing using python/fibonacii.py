'''Write a program to find Fibonacci series of n numbers
Sample:
enter n term:4
0
1
1
2
'''
n=int(input("enter n term:"))
a=0
b=1
s=0
print(a)
print(b)
for i in range(2,n):
    s=a+b
    print(s)
    a=b
    b=s

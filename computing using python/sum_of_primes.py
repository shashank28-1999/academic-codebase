''' Write a program to find sum prime numbers in a given range(starting value included)
Smaple
enter start val:2
enter end val:6
sum= 10
'''
a=int(input("enter start val:"))
b=int(input("enter end val:"))
s=0
c=0
for i in range(a,b):
    c=1
    for j in range(2,i):
        if(i%j==0):
            c=0
            break
    if(c==1):
        s=s+i
print("sum= ",s)

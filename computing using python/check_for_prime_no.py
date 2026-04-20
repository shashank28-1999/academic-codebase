'''Write a program to find given number is prime or not

Sample input and output:
enter n:6
not a prime
'''
a=int(input("enter n:"))
b=True
for i in range(2,a):
    if(a%i==0):
        b=False
        break
    else:
        b=True
if(b==True):
    print("prime")
else:
    print("not a prime")

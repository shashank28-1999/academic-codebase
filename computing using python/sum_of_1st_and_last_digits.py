'''Write a program to find sum of first and last digit in a given number
Sample:
enter num:245
sum= 7
'''
n=int(input("enter num:"))
s=0
l=[]
while(n>0):
    a=n%10
    n=n//10
    l.append(a)
print("sum = ",l[0]+l[len(l)-1])

'''Write a program to find given number is Armstrong or not
Sample:
enter num:153
Armstrong
'''
a=int(input("enter num:"))
l=a
s=0
b=0
while(a>0):
    b=a%10
    s=s+(b*b*b)
    a=a//10
if(l==s):
    print("Armstrong")
else:
    print("Not Armstrong")

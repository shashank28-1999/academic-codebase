'''Write a python program to find the power of a number using recursion..
Sample I/O:
Enter number: 2
Enter power: 7
2 to the power 7 is: 128'''

def power(i,j):
    p=1
    if(p<=j):
        p=i*power(i,j-1)
    return p
n=int(input("Enter number: "))
m=int(input("Enter power: "))
a= power (n,m)
print (n, "to the power","is:", a)
#"""Write a python code that takes a list
#of words and an integer n and print the list of words that
#are longer than n.

#Sample I/O:
#Enter list: ['Python', 'stole', 'my', 'heart']
#Enter an integer: 4
#['Python', 'stole', 'heart']
#"""
a=list(input("Enter list: "))
b=int(input("Enter an integer: "))
c=[i for i in a if len(i)>=b]
print(c)

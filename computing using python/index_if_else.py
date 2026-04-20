"""
#Given a list of n elements.write a python code
#to search a given element x in list using linear search.

#sample I/O:
#case1:
#List of items is [5, 7, 10, 12, 15]
#Enter item to search: 12
#Item found at position: 4

#case2:
#List of items is [5, 7, 10, 12, 15]
#Enter item to search: 100
#Item not found
"""
l=[5,7,10,12,15]
print("List of items is ",l)
a=int(input("Enter item to search: "))
for i in l:
    if(i==a):
        print("Item found at position: ",l.index(i)+1)
        break
else:
    print("Item not found")

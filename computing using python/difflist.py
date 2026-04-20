'''Write a Python program to get the difference between the two lists.
list1 1, 2, 3, 4
list2  1, 2
'''
l1=[1,2,3,4]
l2=[1,2]
l3=list(set(l1)-set(l2))
print(l3)

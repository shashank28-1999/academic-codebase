"""
#Using a list comprehension, create a new list called
#"newlist" out of the list "numbers",
#which contains only the positive numbers from the list,
#as integers.
"""
#sample I/O:
#numbers = [34.6, -203.4, 44.9, 68.3, -12.2, 44.6, 12.7]
l=[34.6,-203.4,44.9,68.3,-12.2,44.6,12.7]
print("numbers = ",l)
newl=[i for i in l if i>0]
print(newl)

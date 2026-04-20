'''
Dictionary operations:
- Print value for key 'John'
- Print all keys using keys()
- Loop over dictionary
- Check if 'Rohit' is a key
- Change value of 'Naresh' to 23 and print
'''
d={'Ajay':7,'Rahul':11,'Naresh':13,'John':17,'Moin':19}
print("Print value associated with key 'John': ",d['John'])
print("Use the keys() method to print out all the keys ",d.keys())
print("Loop over the dictionary:")
for i,j in d.items():
    print(i," ",j)
print("Check if 'Rohit' is a key:")
if('Rohit' in d.keys()):
    print("Yes")
else:
    print("No")
print("Change value associated with 'Naresh' to 23, print values:")
d['Naresh']=23
for i,j in d.items():
    print(i," ",j)

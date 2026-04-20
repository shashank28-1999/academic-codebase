#accept the range to create a list
a=int(input("Enter the start limit of the range:"))
b=int(input("Enter the ending limit of the range:"))
#create a list of odd numbers in the given range
c=[]
for i in range(a,b):
    if(i%2!=0):
        c.append(i)
#Display the output as given in the output format
print(c)

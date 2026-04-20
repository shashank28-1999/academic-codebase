'''
#While purchasing certain items,
#a discount of 10% is offered if the quantity purchased
#is more than 100. If quantity and price per item
#are input through the keyboard,
#write a program to calculate the total expenses.
#Using simple if statement.
'''
#Sample I/O
#Case1:
#Enter the price: 1
#Enter the quantity: 10
#Total amount to be paid: 10.0
#Case2:
#Enter the price: 1
#Enter the quantity: 100
#Total amount to be paid: 90.0
a=int(input("Enter the price: "))
b=int(input("Enter the quantity: "))
if(b>=100):
    c=a*b-(a*b*10)/100.0
else:
    c=(a*b*1.0)
print("Total amount to be paid: ",c)

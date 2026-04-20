#Write a Python program to swap two variables. (L1)
#Sample I/O
#Enter First value 20
#Enter Second value 30
#Before swap a 20 and b 30
#After swaping a 30 and b = 20
a=int (input("Enter First value "))
b=int(input("Enter Second value "))
print("Before swap a ",a," and b = ",b)
a,b=b,a
print("After swaping a ",a," and b = ",b)
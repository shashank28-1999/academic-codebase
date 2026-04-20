#accept the input
a=int(input("Enter a number:"))
#define lambda function fact
fact = None
fact=lambda x: 1 if x==0 or x==1 else x*fact(x-1)
print(a,"!=",fact(a))
#call the lambda function to display the output

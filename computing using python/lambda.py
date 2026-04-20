#accept the input
a=int(input("Enter a number:"))

#define lambda function evenOdd
evenOdd = None
evenOdd=lambda x:"even" if x%2==0 else "odd"
print(evenOdd(a))

#call the lambda function to display the output

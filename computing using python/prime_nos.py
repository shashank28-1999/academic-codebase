#'''Generate a list of PRIME NUMBERS using list comprehension(single line).

#Sample I/O
#Enter the range: 50
#Prime numbers are: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]
#'''
a=int(input("Enter the range: "))
#b=[i for i in range(2,a+1) if all(i%j!=0 for j in range(2,i))]
b=[i for i in range(2,a) if(0 not in [i%j for j in range(2,i)])]
print("Prime numbers are: ",b)

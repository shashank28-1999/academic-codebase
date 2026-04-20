# Write your code here...
def studResult(rno,m1,m2,m3):
    total=m1+m2+m3
    average=(total)/3
    if(m1<40 or m2<40 or m3<40):
        result = 'Result: Fail'
        return total,average, result
    if(average >=70):
        result = 'Result: Distinction'
        return total,average, result
    if (average >=60 and average <70):
        result = 'Result: First Division'
        return total,average, result
    if (average >=50 and average <60):
        result = 'Result: Second Division'
        return total,average, result
    if(average >=40 and average <50):
        result = 'Result: Third Division'
        return total,average, result
#accept the inputs
rno=int(input("Enter RollNo: "))

m1=int(input('Enter m1 marks: '))
m2=int(input('Enter m2 marks: '))
m3=int(input('Enter m3 marks: '))

#invoke the function
total, avg, result = studResult(rno,m1,m2,m3) #write your code for function

#Display the output as given in output format
print('RollNo:',rno)
print('Marks:')
print('M1:',m1)
print('M2:',m2)
print('M3:',m3)
print('Total Marks:',total)
print('Average: %0.2f'%avg)
print(result)

# Write your code here...
r=int(input("Enter RollNo:"))
m1=int(input("Enter m1 marks:"))
m2=int(input("Enter m2 marks:"))
m3=int(input("Enter m3 marks:"))
total=m1+m2+m3
avg=total//3
print("RollNo: ",r)
print("Marks: ")
print("M1: ",m1)
print("M2: ",m2)
print("M3: ",m3)
print("Total Marks: ",total)
print("Average:",avg)
if(m1<40 or m2<40 or m3<40):
    print("Result: Fail")
if(avg>=70):
    print("Result: Distinction")
if(avg>=60 and avg<70):
    print("Result: First Division")
if(avg>=50 and avg<60):
    print("Result: Second Division")
if(avg>=40 and avg<50):
    print("Result: Third Division")

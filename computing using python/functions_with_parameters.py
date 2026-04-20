#define your function studResult(rno,m1,m2,m3)
def studResult(rno,m1,m2,m3):
    total=m1+m2+m3
    avg=total/3
    if(m1<40 or m2<40 or m3<40):
        result='Fail'
    if(avg>=70):
        result='Distinction'
    if(avg>=60 and avg<70):
        result='First Division'
    if(avg>=50 and avg<60):
        result='Second Division'
    if(avg>=40 and avg<50):
        result='Third Division'
    print("RollNo:",rno)
    print("Marks:")
    print("M1:",m1)
    print("M2:",m2)
    print("M3:",m3)
    print("Total Marks:",total)
    print("Average:%0.2f"%avg)
    print("Result:",result)
#accept the inputs
Rno=int(input("Enter RollNo:"))
M1=int(input("Enter m1 marks:"))
M2=int(input("Enter m2 marks:"))
M3=int(input("Enter m3 marks:"))
#invoke the function
studResult(Rno,M1,M2,M3)

# Write your code here...
def studResult(rno,m1=0,m2=0,m3=0):
    total=m1+m2+m3
    avg=total/3
    if(m1<40 or m2<40 or m3<40):
        result='Fail'
        return total,avg,result
    if(avg>=70):
        result='Distinction'
        return total,avg,result
    if(avg>=60 and avg<70):
        result='First Division'
        return total,avg,result
    if(avg>=50 and avg<60):
        result='Second Division'
        return total,avg,result
    if(avg>=40 and avg<50):
        result='Third Division'
        return total,avg,result
# Don't edit the following lines....
exec(open("Postexec.py").read())

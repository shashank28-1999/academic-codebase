exec(open("preexec.py").read())
# Dont edit the above line....
#Write your code here....
print(t)
sum=t[2]+t[3]+t[4]
l1=list(t)
l1.append(sum)
t2=tuple(l1)
print(t2)

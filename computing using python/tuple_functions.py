t = (2,4,5,6,2,3,4,4,7)
print("Tuple: ",t)
s=list(t)
print("Convert the tuple to list: ",s)
print("Get 4th element of the tuple: ",t[3])
print("Get 4th element from last: ",t[-4])
print("Count 4, the number of times it appears in the tuple: ",t.count(4))
print("Check whether 5 exists within a tuple: ",5 in t)
print("Find the length of a tuple: ",len(t))
a,b,c,d,e,f,g,h,i=t[0], t[1], t[2], t[3], t[4], t[5], t[6], t[7], t[8]
l=a+b+c+d+e+f+g+h+i
print("Unpack a tuple in variables and find sum: ",l)
t1=(5)
print("Create a tuple of one item:",t1)
#write your code here
a=[(1,'rama','cse'),(2,'krishna','it'),(3,'sai','cse'),(4,'raju','it')]
s=set()
for (i,j,k) in a:
    s.add(k)
sorted(s)
print(s)

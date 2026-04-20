var1=[1, 2, 3, 4]
var2=True
print("Print out type of var1: ",type(var1))
print("Print out length of var1: ",len(var1))
print("Convert var2 to an integer: ",int(var2))
first=[11.25, 18.0, 20.0]
second=[10.75, 9.50]
l=first+second
print("Paste together first and second: ",l)
l.sort(reverse=True)
print("Sort in descending order and print: ",l)
areas = [11.25, 18.0, 20.0, 10.75, 11.25]
print("Print out the index of the element 20.0: ",(first+second).index(20.0))
print("Print out how often 11.25 appears in areas: ",areas.count(11.25))
areas.reverse()
print("Reverse the orders of the elements in areas: ",areas)
ch="Hello World"
print("Make it upperCase: ",ch.upper())
print("Print out the number of l's: ",ch.count('l'))

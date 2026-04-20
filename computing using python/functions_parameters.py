'''Write a function called add_up_range() that takes a
starting location, ending location and step and
adds up all the integers in that range. For instance,
 add_up_range(2,6,1) would add up the integers
2 + 3 + 4 + 5 and return 14.

Sample I/O:
add_up_range(3, 10, 2)
Sum: 24
'''
def add_up_range(i,j,k):
    sum=0
    for s in range(i,j,k):
        sum=sum+s
    print("Sum:",sum)
add_up_range(3,10,2)

'''Imagine an accounting routine used in a book shop. It works on a list
with sublists, which look like this:

Order Number    Book Title and Author       Quantity    Price per Item
34587           Learning Python, Mark Lutz  4           540.95
98762           Programming Python, Mark Lutz 5         456.80
77226           Head First Python, Paul Barry 3         632.95
88112           Python Programming, John Zelle 2        324.99

Write a Python program, which returns a list with 2-tuples.
Each tuple consists of a the order number and the product
of the price per items and the quantity. The product
should be increased by 100, if the value of the order
is less than 1000 .

Sample output:
[('34587', 2163.8), ('98762', 2284.0), ('77226', 1898.8500000000001), ('88112', 749.98)]
'''
l=[[34587,'Learning Python,Mark Lutz',4,540.95],[98762,'Programming Python,Mark Lutz',5,456.80],[77226,'Head First Python,Paul Barry',3,632.95],[88112,'Python Programming,John Zelle',2,324.99]]
print(list(map(lambda x: x if x[1]>=1000 else(x[0],x[1]+100),map(lambda x:(x[0],x[2]*x[3]),l))))

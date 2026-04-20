#create matrix M1 using List comprehension
M1 =[[i+j for i in range(1,4)] for j in range(2,5)]
#create matrix M2 using List comprehension
M2 =[[i+j for i in range(1,4)] for j in range(2,5)]
#Create a new matrix M3 by adding M1 and M2
M3=[[M1[i][j]+M2[i][j] for i in range(len(M1))] for j in range(len(M2))]
print("M1 = {0}".format(M1))
print("M2 = {0}".format(M2))
print("M3 = {0}".format(M3))
#print all the 3 matrices as given in the output format

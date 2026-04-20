#write your code here.
import numpy as np
a=np.array([[45 ,56, 78 ],[34, 45, 60],[51 ,76 ,62],[43, 30, 44],[50 ,45, 55]])
for i in range(0,5):
    for j in range(0,3):
        if j==0:
            a[i][j]+=5
        elif j==2:
            a[i][j]+=7
print(a)

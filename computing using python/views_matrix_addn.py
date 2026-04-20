#Write your code here
import numpy as np
a=np.arange(27).reshape(3,3,3)
v1=a[0:3,1,0:3].reshape(3,1,3)
v2=a[0:3,0:3,1].reshape(3,3,1)
v3=v1+v2
print(v1)
print(v2)
print(v3)

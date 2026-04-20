#Write your code here...

# Import numpy package
import numpy as np
# Create numpy array A with appropriate number of elements
a=np.arange(120,dtype="int32").reshape([2,3,4,5])
# Reshape A with the given dimensions.
# Display A
print(a)
# Display Dimensions
print(a.shape)
# Display data type
print(a.dtype)

#Write your Code here ...
import matplotlib.image as mpimg
import matplotlib.pyplot as plt
img1=mpimg.imread("bird1.jpg")
print("Dimensions =",img1.shape)
print("Picture Size =",img1.shape[:2])

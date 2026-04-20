#do not either delete/modify the line below
exec (open("data.py").read())

#write your code here to plot a line graph
import matplotlib.pyplot as plt
plt.plot(data)
plt.show()
plt.savefig('plot1.png')
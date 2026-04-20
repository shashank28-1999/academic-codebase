#Write your code here
#print("Response size of web is rsize ");
s='magi01p13.magi.com - - [04/Jul/1995:20:54:23 -0400] \"GET /shuttle/missions/sts-71/images/KSC-95EC-0916.jpg HTTP/1.0\" 200 1665'
rsize=s[len(s)-5:]
print(rsize)
web=s[0:19]
print("Response size of {0} is {1}".format(web,rsize))

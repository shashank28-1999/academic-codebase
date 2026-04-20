exec(open("preexec.py").read())
#........................................
#Write your code here....
c=0
def passCount(result):

    global c
    for rno,name,m1,m2,m3 in stdlist:
        if(m1>40 and m2>40 and m3>40):
            c=c+1
    return c
#........................................
#Don't edit the following statement.
exec(open("postexec.py").read())

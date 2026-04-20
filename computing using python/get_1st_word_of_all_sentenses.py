'''The file secret_message.txt has a secret message encoded into it.
Specifically the first letters of each line, when taken all together,
spell out the secret message. Write a program that reads the file
and prints out the secret message

secret_message.txt
------------------
Probably if you look really closely,
you will be able to see
that there is a secret message
hiding someone in this file.  Try looking at
one particular character that particularly
notable on each line.

Sample Output:
Python
'''
l=[i for i in open("secret_message.txt")]
s=""
for i in l:
    s=s+i[0][0]
print(s)

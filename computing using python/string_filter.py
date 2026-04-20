'''
Write a function called reverse_letters() that takes a
string and creates returns a new string where all
the positions of all the letters have been reversed,
but all other characters have been left in position.
For instance, if the argument is ab*c&&de
then the returned string would be ed*c&&ba.

Sample I/O
Enter String: ab#c&&de!f?
ab#c&&de!f? = fe#d&&cb!a?
'''
def reverse_letters(s):
    b=[i for i in s]
    c=[i for i in b[::-1] if i.isalpha()]
    k=0
    for i in range(len(b)):
        if b[i].isalpha():
            b[i]=c[k]
            k=k+1
    return b
a=raw_input("Enter String: ")
k=reverse_letters(a)
print a," = ",''.join(k)

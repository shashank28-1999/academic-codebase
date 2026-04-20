'''Write a function called simplify_text() that is given a
string and converts the string to all lowercase,
removes all common punctuation except for hyphens
and apostrophes, and returns the new string.

Sample I/O:
Case1:Enter string: This is a test. (Or is it?)
this is a test or is it

Case2:Enter string: ab#'c-&&d'e!f?
ab'c-d'ef
'''
def simplify_text():
    s=raw_input("Enter string: ")
    b=""
    s=s.lower()
    for i in s:
        if((i>='a' and i<='z') or i=="'" or i=="-" or i==" "):
            k=i
            b=b+str(k)
    return b
a=simplify_text()
print(a)

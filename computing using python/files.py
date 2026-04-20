'''
print the longest word that starts and ends with the same letter

wordlist.txt
------------------
a
aah
aardvark
aardvarks
abaci
aback
abacus
:
:
zygotes
zygotic
zymurgy
'''
l=[i for i in open("wordlist.txt")]
for i in l:
    s=i
    if(s[0]==s[len(i)-2]):
        print(i,end=" ")

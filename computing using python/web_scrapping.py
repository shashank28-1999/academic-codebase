'''Write a program to scrape links from a given
webpage.html and print it out

Sample I/O:

www.biet.ac.in
www.brecw.ac.in
www.gietpharmacy.ac.in
www.ihmhyd.org
www.klr.ac.in
www.kmit.in
www.medakenggcollege.com
www.monacollege.com/
www.nitw.ac.in
www.prrmcp.org
'''
from bs4 import BeautifulSoup
import requests
s=BeautifulSoup(open("webpage.html"),"html.parser")
aref=s.find_all("a",limit=10)
for all in aref:
    print(all.get("href"))

# Use hashtags(#) for comments
#Arithmetic with R
3+6
#Assignment using equal operator
Marks=90
Marks
#use quotation marks to create a text character(" " or ' ')
Subject='BA'
Score='84'
#Assignment using leftward operator
#Assignment using rightward operator
t = TRUE
#Data Type
class(Marks)
class(subject)
class(t)
class(Score)
#Data structures 
#Vector
Marks=c(90,80,95,100,90,40,60,92)
Marks
subject=c('BA','SD','GH','JL','OP','FG','UI','MN')
#Length
length(Marks)
lenght(Subject)
#Indexing (USE [] )
Marks[4]
Marks[3:4:5]
Marks[c(3,7)]
#They are the data objects used to categorize and store data as levels.
#Matrix
#Indexing (#mymatrix[rows, columns])
# Extract first row

#Extracts first column 

#Extracts first two rows

#Extracts last two columns

#Extracts fourth and tenth column


#Data frame (create dataframes using the data.frame()function )

#Working with DataFrame
df=data.frame(subject,Marks)
df
# first 6 rows

#last 6 rows
head(df,4)
# Row and columns counts 
dim(df)
# Column Names 
str(df)
#structure of a dataframe
summary(df)
#to get a quick statistical summary of all the columns of a DataFrame, depending on the data.
getwd()
#add new columns to a dataframe using the $ and assignment operators.

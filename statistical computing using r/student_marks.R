#Exploratory Data Analysis (EDA)
#install.packages('readxl')
install.packages('readxl')
#Importing and Exporting Data
getwd()
setwd("D:/ibs/business analytics/R_files/Directories")
titanicdata=read.csv("train.csv")
# For Excel Files
#install.packages('readxl') 
# Load the readxl package
library(readxl)
# Importing the dataset
df<- read_excel("Student Marks.xlsx")
#Working with DataFrame
head(df)
dim(df)
colnames(df)
str(df)
summary(df)
#install.packages("pastecs") #more descriptive statistics
library(pastecs)
ds=stat.desc(df)
ds
#install.packages("psych")
library(psych)
psych::describe(df)
#Using $ Operator to Access Data Frame Column
# gender convert as a factor


# Organizing the data


# Visualization with R Base
#Bar chart, Pie chart,Histogram, Box plot, Scatter plot.
#barplot   , pie    , hist     , boxplot, plot





# Visualization with ggplot2
#install ggplot2
library(ggplot2)
ggplot(df,aes(x=Gender))+geom_bar(aes(fill=Gender))
ggplot(df,aes(Marks))+geom_histogram(fill='red')
ggplot(df,aes(Attendance))+geom_boxplot()
ggplot(df, aes(x=StudyTime,y=Marks))+geom_point()

#summary for only one variable
#Extract Rows and Columns From Data Frame  
#Selecting one column from df
#Using $ Operator to Access Data Frame Column
          ##Using $ Operator#returns a vector
           #returns 1 col df

#Selecting Multiple Columns
#df[rows,columns]
#If either rows or columns are left blank, then it selects all the rows or columns.

            #Grab cols 1 and 3
colnames(df)
df[, c("Reg No." ,   "StudyTime",  "Attendance")] # by name
df[, -1] # drop col 1
df[, -c(1, 4)] # drop cols 1 and 4
#Selecting one row from df
df[4,] #select fourth row
#Selecting Multiple rows
df[c(3, 4, 6),] #select third, fourth, and sixth rows
df[2:5,] #select rows 2 through 5
df[-2, ] # drop row 2
df
#attach() function is  used to access the variables present in the dataframe without calling the data frame.
attach(df)
Marks
#Standard Deviation
sd(Marks)

#add one row to df
newrow=c("22fm",12,85, "Male",21,8.4)
newrow
rbind(df,newrow)
#delete new row
df=df[-12,]
df

df$sn=c(1:11)
df

sn1=c(10:20)
df=cbind(df,sn1)
str(df)
df=df[,-c(7,8)]
df
#Calculate Percentage from Marks
df$Percentage=df$Marks*9.5
df
# Select only Female Students
df[df$Gender=='Female',]
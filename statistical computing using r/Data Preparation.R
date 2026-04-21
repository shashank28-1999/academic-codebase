# Data Preprocessing 
getwd()
#setwd()
# Importing the dataset
#install.packages('readxl')
library(readxl)
df = read_excel("Student Marks.xlsx")
df
head(df)
str(df)
summary(df)
#EDA
#install.packages("psych")
library(psych)
library(readxl)
psych::describe(df$Marks)
#Using $ Operator to Access Data Frame Column
# gender convert as a factor
str(df)
df$Gender=factor(df$Gender)
summary(df)
summary(df$Marks)
# Organizing the data
table(df$Gender)
table(df$Gender)/11*100
# Visualization with R Base
#Bar chart, Pie chart,Histogram, Box plot, Scatter plot.
barplot(table(df$Gender))
pie(table(df$Gender))
hist(df$'Study Time')
boxplot(df$'Study Time')
boxplot(df$Attendance)
plot(df$StudyTime, df$Marks)
# Visualization with ggplot2
#install ggplot2
library(ggplot2)
ggplot(df,aes(x=Gender))+geom_bar(aes(fill=Gender))
ggplot(df,aes(Marks))+geom_histogram(fill='red')
ggplot(df,aes(Attendance))+geom_boxplot()
ggplot(df, aes(x='Study Time',y=Marks))+geom_point()
# Identifying and Handling the Missing Values
any(is.na(df))
sum(is.na(df))
colSums(is.na(df))
df$Attendance = ifelse(is.na(df$Attendance), ave(df$Attendance, FUN = function(x) mean(x, na.rm = TRUE)),df$Attendance)
colSums(is.na(df))
#Remove Age Column
df=df[,-5]
colSums(is.na(df))
df
# Remove duplicate rows
df = df[!duplicated(df), ]
df
#Identify and Remove Outliers
boxplot(df$Attendance)
boxplot(df$`Study Time`)
outlier=boxplot.stats(df$Attendance)$out
outlier
outlier_index=which(df$Attendance%in% c(outlier))
outlier_index
#delete 4th row
df=df[-4,]
df
boxplot(df$Attendance)

# Encoding categorical data
# gender convert as a factor
df$Gender=factor(df$Gender)
str(df)
summary(df)

colnames(df)
#select the relevant columns 
df=df[,-1]
df
# Feature Scaling
df[,1:2]=scale(df[,1:2])
df


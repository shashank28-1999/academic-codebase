# Source of data (https://www.cs.toronto.edu/~delve/data/boston/bostonDetail.html)
#install packages "MASS" to get Boston dataset
install.packages("MASS")
library(MASS) 
attach(Boston)
View(Boston)
names(Boston)
head(Boston) 
-str(Boston)
#Descriptive Statistics
summary(Boston)     
# Handling Missing data
colSums(is.na(Boston))
#Correlation
plot(rm,medv)
cor(rm,medv)
cor(lstat,medv)
# Simple Linear Regression
slr=lm(medv~rm)
summary(slr)
mlr=lm(medv~rm+lstat+age+nox)
summary(mlr)
dr=lm(medv~chas)
summary(dr)
names(slr)

coef(slr)

confint(slr)

abline(slr)

fitted.values(slr)

Actual=medv
Predicted=fitted.values(slr)
Residual=residuals(slr)
Error=data.frame(Actual,Predicted,Residual)
Error
summary(slr)

#Multiple correlation
pairs(Boston)
pairs(Boston,col='red')
#correlation matrix
cor(Boston)
#correlation between Independent variables and dependent variable
cor(Boston,medv)

# Multiple Linear Regression
mlr=lm(medv~rm+lstat+age,data=Boston)
summary(mlr)
aov(mlr)

# Multiple Linear Regression with all variables
lm.fit=lm(medv~.,data=Boston)
summary(lm.fit)

df=data.frame(scale(Boston))
head(df)
lm.fit=lm(medv~.,data=df)
summary(lm.fit)
#Check Multicollinearity 
cor(Boston)
#VIF
library(car)
vif(lm.fit)
#Check   Autocorrelation
library(lmtest)
library(zoo)
dwtest(lm.fit)

plot(lm.fit)


dvr=lm(medv~chas)
summary(dvr)






setwd("D:/ibs/business intelligence & analytics")
fv=read.csv("Fruit_Variety_Sample.csv")
fv
set.seed(111)
train.index<-sample(row.names(fv),14)
train.index
valid.index<-setdiff(row.names(fv),train.index)
valid.index
train.df<-fv[train.index,]
train.df
new.df<-data.frame(Length.mm=80,weight.gms=120)
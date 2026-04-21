setwd("D:/ibs/business intelligence & analytics")
df<-read.csv("water_potability.csv")
library(caret)
library(class)
library(e1071)    # for Naive Bayes
library(rpart)    # for Decision Tree
library(corrplot)
summary(df)
View(df)
names(df)
head(df)
table(df$ph)
str(df)
# Handling Missing data
colSums(is.na(df))

#Data_Cleaning: Removing missing data OR outliers
df[df == "NA"] <- NA
df <- na.omit(df) #removing rows with NA values
sum(is.na(df))
str(df)


df$Potability <- as.factor(df$Potability)
set.seed(1234)  # For reproducibility
trainIndex <- createDataPartition(df$Potability, p = 0.8, list = FALSE)
train_data <- df[trainIndex,]
test_data <- df[-trainIndex,]

train_labels <- train_data$Potability
test_labels <- test_data$Potability
# Remove the label from the training and test sets
train_data_knn <- train_data[, -ncol(train_data)]
test_data_knn <- test_data[, -ncol(test_data)]

# k-NN model with k = 5 (you can adjust k as needed)
knn_pred <- knn(train = train_data_knn, test = test_data_knn, cl = train_labels, k = 5)

# Evaluate the k-NN model
knn_confusion <- confusionMatrix(knn_pred, test_labels)
print(knn_confusion)
# Naive Bayes model
nb_model <- naiveBayes(Potability ~ ., data = train_data)

# Predicting on the test data
nb_pred <- predict(nb_model, test_data)

# Evaluate the Naive Bayes model
nb_confusion <- confusionMatrix(nb_pred, test_labels)
print(nb_confusion)
# Decision Tree model
dt_model <- rpart(Potability ~ ., data = train_data, method = "class")

# Plot the Decision Tree
rpart.plot(dt_model)
dt_pred <- predict(dt_model, test_data, type = "class")
# Evaluate the Decision Tree model
dt_confusion <- confusionMatrix(dt_pred, test_labels)
print(dt_confusion)

# Boxplot for the 'ph' variable
boxplot(df$ph, main = "Boxplot of pH", ylab = "pH", col = "lightblue")

# Boxplot for the 'Hardness' variable
boxplot(df$Hardness, main = "Boxplot of Hardness", ylab = "Hardness", col = "lightgreen")

# Boxplot for the 'Solids' variable
boxplot(df$Solids, main = "Boxplot of Solids", ylab = "Solids (ppm)", col = "lightcoral")

# You can create similar boxplots for other variables

# Boxplot for all variables in a grid
par(mfrow = c(3, 3))  # Adjust the grid layout as needed
boxplot(df$ph, main = "pH", col = "lightblue")
boxplot(df$Hardness, main = "Hardness", col = "lightgreen")
boxplot(df$Solids, main = "Solids", col = "lightcoral")
boxplot(df$Chloramines, main = "Chloramines", col = "lightyellow")
boxplot(df$Sulfate, main = "Sulfate", col = "lightpink")
boxplot(df$Conductivity, main = "Conductivity", col = "lightgray")
boxplot(df$Organic_carbon, main = "Organic Carbon", col = "lightcyan")
boxplot(df$Trihalomethanes, main = "Trihalomethanes", col = "lightgoldenrod")
boxplot(df$Turbidity, main = "Turbidity", col = "lightsteelblue")
par(mfrow = c(1, 1))  # Reset the layout
# Boxplot of 'ph' grouped by 'Potability'
boxplot(ph ~ Potability, data = df, main = "Boxplot of pH by Potability", 
        xlab = "Potability", ylab = "pH", col = c("lightblue", "lightgreen"))

# Similarly for other variables
boxplot(Hardness ~ Potability, data = df, main = "Boxplot of Hardness by Potability", 
        xlab = "Potability", ylab = "Hardness", col = c("lightblue", "lightgreen"))

# And for other variables as needed...
library(ggplot2)
plot_bar_graphs <- function(variable) {
  ggplot(df, aes_string(x = variable, fill = factor(df$Potability))) +
    geom_bar(position = "dodge") +
    labs(title = paste("Bar Graph of", variable, "by Potability"),
         x = variable,
         y = "Count",
         fill = "Potability") +
    theme_minimal()
}

# Example for 'ph'
p_ph <- plot_bar_graphs("ph")
print(p_ph)


# Repeat for other variables
# Example for 'Hardness'
p_hardness <- plot_bar_graphs("Hardness")
print(p_hardness)
# Function to create and save histograms
create_histogram <- function(variable) {
  p <- ggplot(df, aes_string(x = variable)) +
    geom_histogram(binwidth = 1, fill = "skyblue", color = "black", alpha = 0.8) +
    labs(title = paste("Histogram of", variable),
         x = variable,
         y = "Frequency") +
    theme_minimal()
  
  # Save the histogram
  print(p)
}

# List of variables for which to create histograms
variables <- c("ph", "Hardness", "Solids", "Chloramines", "Sulfate", 
               "Conductivity", "Organic_carbon", "Trihalomethanes", "Turbidity")

# Loop through variables and create histograms
for (var in variables) {
  create_histogram(var)
}
# Convert Potability to a factor if it's not already
data$Potability <- as.factor(data$Potability)

# List of variables to plot against Potability
variables <- c("ph", "Hardness", "Solids", "Chloramines", "Sulfate", 
               "Conductivity", "Organic_carbon", "Trihalomethanes", "Turbidity")

# Function to create and display scatter plots
create_scatter_plot <- function(variable) {
  p <- ggplot(df, aes_string(x = variable, y = "Potability")) +
    geom_jitter(alpha = 0.7, width = 0.2, height = 0.2) +
    labs(title = paste("Scatter Plot of", variable, "vs Potability"),
         x = variable,
         y = "Potability") +
    theme_minimal()
  
  print(p)  # Display the scatter plot in the R terminal or plotting window
}

# Loop through variables and create scatter plots
for (var in variables) {
  create_scatter_plot(var)
}

numeric_data <- df[sapply(df, is.numeric)]
correlation_matrix <- cor(numeric_data, use = "pairwise.complete.obs")
print(correlation_matrix)
corrplot(correlation_matrix, method = "color", type = "upper", 
         tl.col = "black", tl.srt = 45)




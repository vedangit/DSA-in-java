import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split

# Generate some sample data (you can replace this with your dataset)
np.random.seed(0)
X = np.random.rand(100, 1)  # Features (e.g., square footage)
y = 5 * X + np.random.randn(100, 1)  # Target variable (e.g., house prices)

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Create and fit the linear regression model
model = LinearRegression()
model.fit(X_train, y_train)

# Make predictions on the test set
y_pred = model.predict(X_test)

# Plot the training data and regression line
plt.scatter(X_train, y_train, label="Training Data")
plt.plot(X_test, y_pred, color='red', linewidth=2, label="Regression Line")
plt.xlabel("Square Footage")
plt.ylabel("House Price")
plt.title("Linear Regression for House Price Prediction")
plt.legend()
plt.show()

# Evaluate the model
from sklearn.metrics import mean_squared_error, r2_score

mse = mean_squared_error(y_test, y_pred)
r2 = r2_score(y_test, y_pred)

print("Mean Squared Error:", mse)
print("R-squared:", r2)

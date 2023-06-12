# Market Simulation
This code implements a market simulation. It consists of the Crate and Cashier classes responsible for managing market operations.

The Crate class keeps track of total sales, total profit, salad profit, and dessert sales. It contains methods to calculate sales and daily profit. The printReceipt method displays the total sales, total profit, salad profit, and dessert sales.

The Cashier class represents a cashier at the market. It is associated with a Crate object. The workTime method allows the cashier to perform transactions. It prompts the user to enter the food code and price. The calculate method of the Crate class is used to calculate sales and profit. The process repeats until the user indicates that the order is finished. Finally, the printReceipt method is called to display a summary of the transactions.

The Market class serves as the entry point of the program. It creates a Cashier object to represent the cashier. The workTime method is called twice with different cashiers to simulate market operations.

This code is used to track market transactions and display the results. It calculates sales and profit based on user input and prints a summary of the transactions.


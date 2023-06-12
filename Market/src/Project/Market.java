package Project;

import java.util.Scanner;

class Crate {
    static int totalSales;
    static int totalProfit;
    static int saladProfit;
    static int dessertSale;

    public Crate() {
        System.out.println("Welcome");
    }

    public Crate(String name) {
        System.out.println("Welcome " + name);
    }

    public void calculate(int choice, double price) {
        calculateTotalSales(price);
        calculateDailyProfit(choice, price);
    }

    private void calculateTotalSales(double price) {
        totalSales += price;
    }

    private void calculateDailyProfit(int choice, double price) {
        double profit;
        switch (choice) {
            case 1:
                profit = price * 30 / 100;
                totalProfit += profit;
                saladProfit += profit;
                break;
            case 2:
                profit = price * 25 / 100;
                totalProfit += profit;
                break;
            case 3:
                profit = price * 35 / 100;
                totalProfit += profit;
                break;
            case 4:
                profit = price * 20 / 100;
                totalProfit += profit;
                dessertIncrease();
                break;
        }
    }

    private void dessertIncrease() {
        dessertSale++;
    }

    public void printReceipt() {
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Total Profit: " + totalProfit);
        System.out.println("Salad Profit: " + saladProfit);
        System.out.println("Dessert Sale: " + dessertSale);
    }
}

class Cashier {
    Crate cs;

    public Cashier() {
        cs = new Crate();
        System.out.println("Welcome");
    }

    public Cashier(String name) {
        cs = new Crate(name);
        System.out.println("Welcome " + name);
    }

    public void workTime() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Crate cs = new Crate();
            System.out.println("Salad=1, Hamburger=2, Pizza=3, Dessert=4");
            System.out.println("Enter food code: ");
            int choice = scanner.nextInt();

            while (choice < 1 || choice > 4) {
                System.out.println("Incorrect input! Please try again:");
                choice = scanner.nextInt();
            }

            System.out.println("Enter price:");
            int price = scanner.nextInt();

            cs.calculate(choice, price);

            System.out.println("If your order is finished, press 5. If not, you can continue by entering a different number:");
            int finish = scanner.nextInt();

            if (finish == 5) {
                break;
            }
        }

        cs.printReceipt();
    }
}

public class Market {
    public static void main(String[] args) {
        Cashier csh1 = new Cashier("Ayfer");
        csh1.workTime();

        Cashier csh2 = new Cashier();
        csh2.workTime();
    }
}
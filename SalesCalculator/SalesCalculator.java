package HyperSkillsFirstProject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Product {
    private String name;
    private float price;

    public Product (String name, float price) {
        this.name = name;
        this.price = price;
    }

    public float getPrice () {
        return this.price;
    }

    public String getName () {
        return this.name;
    }
}

class LineItem{
    private Product product;
    private int amount;

    public float getPrice() {
        return this.product.getPrice() * this.amount;
    }

    public Product getProduct() {
        return this.product;
    }

    public LineItem(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public LineItem(Product product) {
        this.product = product;
        this.amount = 1;
    }
}


class Sales {
    public ArrayList<LineItem> orders;
    private float expenses = 0;

    public Sales (ArrayList<LineItem> orders) {
        this.orders = orders;
    }

    public void placeOrder (LineItem order) {
        this.orders.add(order);
    }

    public void setExpense (float expense) {
        this.expenses += expense;
    }

    public float getIncome() {
        float totalIncome = 0;
        for (LineItem order : this.orders) {
            totalIncome += order.getPrice();
        }
        return totalIncome;
    }

    public float getTotalIncome () {
        float income = getIncome();
        return income - this.expenses;
    }

    public void printAllSales() {
        if (this.orders.size() > 0) {
            System.out.println("Earned amount:");
        }
        for (LineItem order : this.orders) {
            System.out.println(order.getProduct().getName() + ": $" + (int) order.getPrice());
        }
        System.out.println("Income: $" + (int) this.getTotalIncome());
    }
}



public class SalesCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LineItem bubblegum = new LineItem(new Product("Bubblegum", 202));
        LineItem toffee = new LineItem(new Product("Toffee", 118));
        LineItem iceCream = new LineItem(new Product("Ice cream", 2250));
        LineItem milkChocolate = new LineItem(new Product("Milk chocolate", 1680));
        LineItem doughnut = new LineItem(new Product("Doughnut", 1075));
        LineItem pancake = new LineItem(new Product("Pancake", 80));

        Sales sales = new Sales(new ArrayList<LineItem>(
                Arrays.asList(bubblegum, toffee, iceCream, milkChocolate, doughnut, pancake)
            )
        );
        sales.printAllSales();

        System.out.println("Staff expenses:");
        sales.setExpense(scanner.nextFloat());

        System.out.println("Other expenses:");
        sales.setExpense(scanner.nextFloat());

        float netIncome = sales.getTotalIncome();
        System.out.println("Net income: $" + (int) netIncome);
    }
}
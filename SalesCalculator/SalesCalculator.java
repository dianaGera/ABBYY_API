package HyperSkillsFirstProject;
import java.util.ArrayList;
import java.util.Arrays;


class Product {
    String name;
    float price;

    public Product (String name, float price) {
        this.name = name;
        this.price = price;
    }

}

class Order{
    Product product;
    int amount;
    int price;

    public float getPrice() {
        return this.product.price * this.amount;
    }

    public Order(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Order(Product product) {
        this.product = product;
        this.amount = 1;
    }
}


class Sales {
    ArrayList<Order> orders;
    float expences = 0;

    public Sales (ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void placeOrder (Order order) {
        this.orders.add(order);
    }

    public void setExpence (float expence) {
        this.expences = expence;
    }

    public float getIncome() {
        float totalIncome = 0;
        for (Order order : this.orders) {
            totalIncome += order.getPrice();
        }
        return totalIncome;
    }

    public float getTotalIncome () {
        float income = getIncome();
        return income - this.expences;
    }

    public void printAllSales() {
        if (this.orders.size() > 0) {
            System.out.println("Earned amount:");
        }
        for (Order order : this.orders) {
            System.out.println(order.product.name + ": $" + (int) order.getPrice());
        }
        System.out.println("Income: $" + (int) this.getTotalIncome());
    }
}



public class SalesCalculator {
    public static void main(String[] args) {

        Order bubblegum = new Order(new Product("Bubblegum", 202));
        Order toffee = new Order(new Product("Toffee", 118));
        Order iceCream = new Order(new Product("Ice cream", 2250));
        Order milkChocolate = new Order(new Product("Milk chocolate", 1680));
        Order doughnut = new Order(new Product("Doughnut", 1075));
        Order pancake = new Order(new Product("Pancake", 80));

        Sales sales = new Sales(new ArrayList<Order>(
                Arrays.asList(bubblegum, toffee, iceCream, milkChocolate, doughnut, pancake)
            )
        );
        sales.printAllSales();
    }
}
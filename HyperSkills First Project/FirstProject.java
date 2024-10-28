package HyperSkillsFirstProject;

public class FirstProject {
    public static void main(String[] args) {

        int bubblegum = 202;
        int toffee = 118;
        int iceCream = 2250;
        int milkChocolate = 1680;
        int doughnut = 1075;
        int pancake = 80;
        

        String line = "Earned amount: " +
        "\nBubblegum: $" + bubblegum + 
        "\nToffee: $" + toffee + 
        "\nIce cream: $" + iceCream + 
        "\nMilk chocolate: $" + milkChocolate + 
        "\nDoughnut: $" + doughnut + 
        "\nPancake: $" + pancake +
        "\nIncome: $" + (bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake);

        System.out.println(line);
    }
}
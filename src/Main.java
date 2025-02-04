import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inOne = new Scanner(System.in);
        Scanner inTwo = new Scanner(System.in);
        Scanner inThree = new Scanner(System.in);
        Scanner inFour = new Scanner(System.in);
        double springCost = 0.00;
        double summerCost = 0.00;
        double fallCost = 0.00;
        double winterCost = 0.00;
        double totalCost = 0.00;
            System.out.println("What is your home maintenance costs for Spring?");
                springCost = inOne.nextDouble();
            System.out.println("What is your home maintenance costs for Spring?");
                summerCost = inTwo.nextDouble();
            System.out.println("What is your home maintenance costs for Spring?");
                fallCost = inThree.nextDouble();
            System.out.println("What is your home maintenance costs for Spring?");
                winterCost = inFour.nextDouble();
                totalCost = springCost + summerCost + fallCost + winterCost;
            System.out.println("The sum of " + springCost + " " + summerCost + " " + fallCost + " " + winterCost + " is "+ totalCost);
    }
}
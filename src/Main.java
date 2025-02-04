import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double springCost = 0.00;
        double summerCost = 0.00;
        double fallCost = 0.00;
        double winterCost = 0.00;
        double totalCost = 0.00;
            System.out.println("What is your home maintenance costs for Spring?");
                springCost = in.nextDouble();
            System.out.println("What is your home maintenance costs for Summer?");
                summerCost = in.nextDouble();
            System.out.println("What is your home maintenance costs for Fall?");
                fallCost = in.nextDouble();
            System.out.println("What is your home maintenance costs for Winter?");
                winterCost = in.nextDouble();
                totalCost = springCost + summerCost + fallCost + winterCost;
            System.out.println("The sum of " + springCost + " " + summerCost + " " + fallCost + " " + winterCost + " is "+ totalCost);
    }
}
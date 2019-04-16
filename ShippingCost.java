package shippingcost;

import java.util.Scanner;

public class ShippingCost {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of the package:\t");
        double weight = input.nextDouble();

        while (weight <= 0) {
            System.out.println("The input value should be greater than 0. \n Please do it over.\n");
            weight = input.nextDouble();
        }

        if (weight > 0 && weight <= 1) {
            System.out.println("The package consts 3.5.");

        } else if (weight > 1 && weight <= 3) {
            System.out.println("The package costs 5.5.");

        } else if (weight > 3 && weight <= 10) {
            System.out.println("The package consts 8.5.");

        } else if (weight > 10 && weight <= 20) {
            System.out.println("The package consts 10.5.");

        } else {
            System.out.println("The package can't be shopped.");

        }

    }

}

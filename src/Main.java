//Shipping Cost Calculator Pseudocode:
//class ShippingCosts
//	main()
//		num itemPrice
//		num shippingCost
//		num totalPrice
//		output “What is the price of your item?”
//		input itemPrice
//		if itemPrice < 100 then
//			shippingCost = itemPrice * .02
//			totalPrice = shippingCost + itemPrice
//			output “Your shipping cost is” + shippingCost “and your total cost is” + totalPrice
//		else
//			output “Your total cost is” + itemPrice
//		endIf
//	return
//endClass

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost;
        double totalPrice;
        String trash = "";

        System.out.println("What is the price of your item?");

        if (in.hasNextDouble())
        {

            itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice < 100)
            {
                shippingCost = itemPrice * .02;
                totalPrice = shippingCost + itemPrice;
                System.out.println("Your shipping cost is: $" + shippingCost + " and your total cost is: $" + totalPrice);
            }
            else
            {
                System.out.println("Your total cost is: $" + itemPrice);
            }
        }
        else
        {
            trash =  in.nextLine();
            System.out.println("You said your wage was: " + trash);
            System.out.println("Run again and enter a number value.");
        }
    }
}
/*
AUTHOR: KASHYAP THAKKAR
LAB01
SID: 000742712
*/
/*
I, Kashyap Thakkar, student number 000742712, certify that all code submitted is my own work; that I have not copied it from any other source.  
I also certify that I have not allowed my work to be copied by others.
*/
package lab01;

import java.util.Scanner;

public class Lab01 {

    public static void main(String[] args) {

        String name, number, postal, banana, milk, onion, spinner, coke;//string variables to hold strings

        int bananaCount = 0, milkCount = 0, onionCount = 0, spinnerCount = 0, cokeCount = 0, discount, hst, spinnerTemp = 0;//int variables to hold integers

        double subTotal1, subTotal2, discountPrice, hstPrice, totalAmount, bananaPrice = 0, milkPrice = 0, onionPrice = 0, spinnerPrice = 0, cokePrice = 0;//doubles for non-integers

        Scanner scan = new Scanner(System.in);//scanner for input

        /*
           welcome message output
         */
        System.out.println("Hello and welcome to the Hasty Market\n");

        System.out.println("*** No HST if you spend more than $100 before taxes! ***\n");

        System.out.printf("Please tell us your name: ");//output message to take user input
        name = scan.nextLine();//user input for his name

        System.out.printf("\nPlease tell us Your phone number: ");//output message to take user input
        number = scan.nextLine();//user input for his phone number

        System.out.printf("\nPlease tell us your postal code: ");//output message to take user input
        postal = scan.nextLine();//user input for his postal code

        //output message to ask for banana to user
        System.out.println("\nFirst we have Bananas for $0.75.");
        System.out.printf("Would you like to buy it (y/n)? ");

        banana = scan.next();//user input to take user's decision

        //process: if user want to buy banana then ask him how many he or she want.
        if ("y".equals(banana)) {
            System.out.printf("\nHow many would you like? ");//output message how many banana user want
            bananaCount = scan.nextInt();//user input how many he want
            bananaPrice = 0.75 * bananaCount;//process to count total price of bananas
        }

        //output message to ask for milk to user
        System.out.println("\nNext, we have milk bags for $4.25.");
        System.out.printf("Would you like to buy it (y/n) ? ");

        milk = scan.next();//user input to take user's decision

        //process: if user want to buy milk then ask him how many he or she want.
        if ("y".equals(milk)) {
            System.out.printf("\nHow many would you like? ");//output message how many milk bags user want
            milkCount = scan.nextInt();//user input how many he want
            milkPrice = 4.25 * milkCount;//process to count total price of milk
        }

        //output message to ask for onions to user
        System.out.println("\nNext, we have onions for $0.80.");
        System.out.printf("Would you like to buy it (y/n) ? ");

        onion = scan.next();//user input to take user's decision

        //process: if user want to buy onions then ask him how many he or she want.
        if ("y".equals(onion)) {
            System.out.printf("\nHow many would you like? ");//output message how many onions bags user want
            onionCount = scan.nextInt();//user input how many he want
            onionPrice = 0.80 * onionCount;//process to count total price of onions
        }

        //output message to ask for spinner to user
        System.out.println("\nNext, we have fidget spinner for $2.99. (Buy three get one free)");
        System.out.printf("Would you like to buy it (y/n) ? ");

        spinner = scan.next();//user input to take user's decision

        //process: if user want to buy spinner then ask him how many he or she want
        if ("y".equals(spinner)) {
            System.out.printf("\nHow many would you like? ");//output message how many spinner bags user want
            spinnerCount = scan.nextInt();//user input how many he want
            spinnerPrice = 2.99 * spinnerCount;//process to count total price of spinners

            spinnerTemp = spinnerCount / 3;//temporary variable to hold  a number of spinners wich user will have free
            spinnerCount += spinnerTemp;//total spinners

        }

        //output message to ask for coke to user
        System.out.println("\nNext, we have coke for $0.99.");
        System.out.printf("Would you like to buy it (y/n) ? ");

        coke = scan.next();//user input to take user's decision

        //process: if user want to buy coke then ask him how many he or she want
        if ("y".equals(coke)) {
            System.out.printf("\nHow many would you like? ");//output message how many coke bags user want
            cokeCount = scan.nextInt();//user input how many he want
            cokePrice = 0.99 * cokeCount;//process to count total price of spinners
        }
        System.out.printf("\nDo you have any additional discounts? (0 - 100 percent)  ");//output message for asking to user that how much discount he or she has
        discount = scan.nextInt();//user input for discount
        subTotal1 = bananaPrice + milkPrice + spinnerPrice + onionPrice + cokePrice;//process to count subtotal without hst and discount

        //process: If the subtotal is more than 100 then hst will become 0
        if (subTotal1 > 100) {
            hst = 0;
        } else {
            hst = 13;
        }
        hstPrice = (subTotal1 * hst) / 100;//process to count price of hst
        subTotal2 = subTotal1 + hstPrice;//process to include the price of hst in subtotal1
        discountPrice = (subTotal2 * discount) / 100;//process to count price of discount
        totalAmount = subTotal2 - discountPrice;//final amount after including hst price and substracting discount price from subtotal1
        //output to show a final recipt to the user
        System.out.println("____________________________________________________________________\n");
        System.out.println("                             Hasty Market");
        System.out.println("                             www.hasty.ca");
        System.out.println("                             61 RICHWILL ROAD, HAMILTON, ON.");
        System.out.println("                             (289)-689-1873");
        System.out.println("____________________________________________________________________");

        System.out.println("____________________________________________________________________\n");
        System.out.println("                            Customer Details\n");
        System.out.println("NAME : " + name);
        System.out.println("NUMBER : " + number);
        System.out.println("POSTAL CODE : " + postal);
        System.out.println("____________________________________________________________________\n");

        System.out.println("PRODUCT | QUANTITY | UNIT PRICE | TOTAL PRICE|");
        //process: if any item user didn't buy then it dosen't appear on reciept
        if ("y".equals(banana)) {
            System.out.printf("Banana  | %8d |      $0.75 |%11.2f | ", bananaCount, bananaPrice);
            // System.out.printf(" |      $0.75 |%11.2f | ",bananaPrice);
        }

        if ("y".equals(milk)) {
            System.out.printf("\nMilk    | %8d |      $4.25 |%11.2f | ", milkCount, milkPrice);
            //System.out.printf(" |      $4.25 |%11.2f | ",milkPrice);
        }

        if ("y".equals(onion)) {
            System.out.printf("\nOnion   | %8d |      $0.80 |%11.2f | ", onionCount, onionPrice);
            //System.out.printf(" |      $0.80 |%11.2f | ",onionPrice);
        }

        if ("y".equals(spinner)) {
            System.out.printf("\nSpinner | %4d +%2d |      $2.99 |%11.2f | ", (spinnerCount - spinnerTemp), spinnerTemp, spinnerPrice);
            // System.out.printf(" |      $2.99 |%11.2f | ",spinnerPrice);
        }

        if ("y".equals(coke)) {
            System.out.printf("\nCoke    | %8d |      $0.99 |%11.2f | ", cokeCount, cokePrice);
            //System.out.printf(" |      $0.99 |%11.2f | ",cokePrice);
        }

        System.out.println("\n_____________________________________________________________________");

        System.out.printf("Sub Total1   : %.2f\n", subTotal1);

        System.out.printf("H.S.T        : %.2f\n", hstPrice);

        System.out.printf("Sub Total2   : %.2f\n", subTotal2);

        System.out.printf("Discount(%3d): %1.2f\n", discount, discountPrice);

        System.out.printf("Final Amount : %.2f\n", totalAmount);

        System.out.println("_____________________________________________________________________");
    }
}

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double accountBalance = 100.00;
	    double withdrawAmt = 0.00;
	    double depositAmt = 0.00;
	    boolean cont = false; //loop stopping variable

	    do{
	    	//promts user
	        System.out.println("Welcome, please select an option");
	        System.out.println("Display Account Balance - Press 1");
	        System.out.println("Withdraw from your account - Press 2");
	        System.out.println("Deposit funds to your account - Press 3");

	        Scanner input = new Scanner(System.in);

	        //user input
	        int usrInput = input.nextInt();

	        //depending on condition met - prints account balance, withdraw and deposit
	        if (usrInput == 1){
	        	System.out.println(accountBalance);
			}else if (usrInput == 2){
	        	System.out.println("What is the amount you'd like to withdraw? $x.xx");
	        	withdrawAmt = input.nextDouble(); //prompts for withdraw amount

				//checks if enough funds are available in account balance
	        	if (accountBalance >= withdrawAmt){
	        		accountBalance -= withdrawAmt; //subtracts withdraw amount from account balance
	        		System.out.println("Withdrawing: $" + withdrawAmt + ", and your remaining balance is: $" + accountBalance);
				}else {
	        		System.out.println("You lack the funds to complete this request.");
				}

			}else if (usrInput == 3){
	        	System.out.println("How much would you like to deposit? - $x.xx");
	        	depositAmt = input.nextDouble(); //prompts for deposit amount
	        	accountBalance += depositAmt; //adds deposit amount to account balance
	        	System.out.println("You have deposited: $" + depositAmt + " your new account balance is: $" + accountBalance);
			} else{
				System.out.println("Error - Incorrect input.");
			}

        }while(cont);
    }
}

/*
-- A Simple Car Loan Payment Calculator --

Solidifying Java concepts learned so far: 
  - Conditionals
  - Boolean expressions
  - Arithmethic expressions

In this project, you will write a program that will calculate the monthly car payment a user should expect to make after taking out a car loan. The program will include the following:

    - Car loan amount
    - Interest rate of the loan
    - Length of the loan (in years)
    - Down payment
	
Codecademy URL: https://www.codecademy.com/courses/learn-java/projects/loan-payment-calculator
    
*/

public class CarLoan {
	public static void main(String[] args) {

    // Variables to set for the program:
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;
    
    // Calculator:
    if (loanLength <= 0 || interestRate <= 0){
      System.out.print("Error! You must take out a valid car loan.");
    } else if (downPayment >= carLoan){
      System.out.print("This car can be paid in full. You do not need a loan");
    } else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12 ;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance * interestRate) / 100;

      int monthlyPayment = monthlyBalance + interest;
      System.out.println("Your monthly payments for this loan is: £" + monthlyPayment);
    }

	}
}

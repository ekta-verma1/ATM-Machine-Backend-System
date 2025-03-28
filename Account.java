package project1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    //Set the customer number
    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    //Get the customer number
    public int getCustomerNumber() {
        return customerNumber;
    }

    //Set the pin number
    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    //Get the pin number
    public int getPinNumber() {
        return pinNumber;
    }

    //Get Checking Account Balance
    public double getCheckingBalance() {
        return checkingBalance;
    }

    //Get Saving Account Balance
    public double getSavingBalance() {
        return savingBalance;
    }

    //Calculate Checking Account Withdrawal
    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    //Calculate Saving Account Withdrawal
    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    //Calculate Checking Account Deposit
    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    //Calculate Saving Account Deposit
    public double calcSavingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    // customer checking account withdraw input (withdraw funds)
    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = sc.nextDouble();

        if((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be negative.");
        }
    }

    // customer saving account withdraw input (withdraw funds)
    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = sc.nextDouble();

        if((savingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: " + savingBalance);
        }else{
            System.out.println("Balance cannot be negative.");
        }
    }

    // customer checking account deposit input
    public void getCheckingDepositInput() {
        System.out.println("Saving Account Balance: "+ moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit from Checking Account: ");
        double amount = sc.nextDouble();

        if((checkingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be negative.");
        }
    }

    // customer saving account Deposit input (withdraw funds)
    public void getSavingDepositInput() {
        System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit from Saving Account: ");
        double amount = sc.nextDouble();

        if((savingBalance + amount) >= 0) {
            calcSavingDeposit(amount);
            System.out.println("New Saving Account Balance: " + savingBalance);
        }else{
            System.out.println("Balance cannot be negative.");
        }
    }

}



















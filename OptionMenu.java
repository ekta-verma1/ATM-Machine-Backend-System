package project1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account{
    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    // validate login information customer number and pin number

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(12345, 01);
                data.put(6789, 02);
                System.out.println("Welcome to the ATM Project!");
                System.out.println("Enter your Customer Number: ");
                setCustomerNumber(sc.nextInt());
                System.out.println("Enter your pin number: ");
                setPinNumber(sc.nextInt());
            } catch (Exception e) {
                System.out.println("Invalid character(s). Enter only numbers! ");
                x = 2;
            }
            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
                    getAccountType();
                }
            }
            System.out.println("Wrong Customer Number or Pin Number!");
        } while (x == 1);
    }

    //Display account type with selection

    public void getAccountType() {
        System.out.println("Select the account you want to access: ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.println("Choice: ");

        int selection = sc.nextInt();

        switch(selection) {
            case 1 :
                getChecking();
                break;
            case 2 :
                getSaving();
                break;
            case 3 :
                System.out.println("Thank You for using this ATM.");
                break;
            default:
                System.out.println("Invalid Choice");
                getAccountType();
        }
    }

    //Display Checking Account Menu with selections

    public void getChecking() {
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        int selection = sc.nextInt();
        switch (selection){
            case 1 :
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2 :
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4 :
                System.out.println("Thank You for using this ATM.");
            default:
                System.out.println("Invalid choice");
                getChecking();
        }
    }

    //Display Saving Account Menu with selections

    public void getSaving() {
        System.out.println("Saving Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        int selection = sc.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM.");
            default:
                System.out.println("Invalid choice");
                getSaving();
        }
    }

}

















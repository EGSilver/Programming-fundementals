package homework;

public class BankAccount {
    private double totalAmount;
    private double accountNumber;

    public BankAccount(double totalAmount, double accountNumber) {
        this.totalAmount = totalAmount;
        this.accountNumber = accountNumber;
    }

    public double depositMoney(double amountDeposited) {
        if (amountDeposited < 0) {
            System.out.println("Error, amount deposited is lower then 0");
        } else if (amountDeposited > 0) {
            totalAmount = this.totalAmount + amountDeposited;
            System.out.println("You deposited = " + amountDeposited + "€");
        }
        return totalAmount;
    }

    public double getTotalAmount() {
        System.out.println("Your total balance is " + totalAmount + "€");
        return totalAmount;
    }

    public double withdrawMoney(double AmountToWithdraw) {
        double a = 0;
        if (AmountToWithdraw < 0) {
            System.out.println("Error, amount is lower then 0");
        } else if (AmountToWithdraw > 0) {
            a = this.totalAmount - AmountToWithdraw;
            System.out.println("You withdrew = " + AmountToWithdraw + "€ \nYour total balance  is = " + a);
        }
        return a;
    }

    public void isTotalPositive() {
        if (totalAmount < 0) {
            System.out.println("Your balance dropped below 0");
        }
    }
}


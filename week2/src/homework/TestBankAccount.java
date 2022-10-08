package homework;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(2000,93487382);
        System.out.println(a.getTotalAmount());
        System.out.println(a.depositMoney(1000));
        System.out.println(a.withdrawMoney(500));
        a.isTotalPositive();
        //System.out.println(a.getTotalAmount());
    }
}

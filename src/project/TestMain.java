package project;

public class TestMain {
    public static void main(String[] args) {
        MyWallet myWallet = new MyWallet();
        System.out.println(myWallet.amountOfMoney());
        System.out.println(myWallet.spendingMoney(50));
        System.out.println(myWallet.addMoney(120.5));
        System.out.println(myWallet);
        System.out.println("Test");
        //ghj
    }
}

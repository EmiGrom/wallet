package project;

public class TestMain {
    public static void main(String[] args) {
        double money = 0;
        WalletPLN walletPLN = new WalletPLN(money);
        System.out.println(walletPLN.amountOfMoney());
        System.out.println(walletPLN.spendingMoney(50));
        System.out.println(walletPLN.addMoney(120.5));
        System.out.println(walletPLN);
        System.out.println("Test");
        WalletGR walletGR = new WalletGR(money);
        System.out.println(walletGR.amountOfMoney());
        System.out.println("Test");
        WalletKILO walletKILO = new WalletKILO(money);
        System.out.println(walletKILO.addMoney(4));
        System.out.println("Test");
        //ghj

    }
}

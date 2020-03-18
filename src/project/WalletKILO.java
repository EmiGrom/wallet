package project;

public class WalletKILO extends Wallet {
    private double money;

    public WalletKILO(double money) {
        MoneyType moneyType1 = moneyType.KILO;
        this.money = 11;
    }
    @Override
    public double addMoney(double money) {
        return this.money += money;
    }
    @Override
    public double spendingMoney(double money) {
        return this.money -= money;
    }
    @Override
    public double amountOfMoney() {
        return money;
    }
}

package project;

public class WalletKILO extends Wallet {
    private double money;

    public WalletKILO(double money) {
        moneyType = MoneyType.KILO;
       // MoneyType moneyType3 = MoneyType.KILO;
        this.money = money;
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

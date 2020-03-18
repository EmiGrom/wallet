package project;

public class WalletGR extends Wallet {
    private double money;

    public WalletGR(double money) {
        MoneyType moneyType1 = moneyType.GR;
        this.money = 23;
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

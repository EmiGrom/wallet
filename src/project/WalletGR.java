package project;

public class WalletGR extends Wallet {
    private double money;

    public WalletGR(double money) {
        MoneyType moneyType2 = moneyType.GR;
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

package project;

public class MyWallet extends Wallet {
    private double money;
    public MyWallet() {
        moneyType = MoneyType.PLN;
        money = 200.0;
    }
    @Override
    public double addMoney(double money) {
        return this.money +=  money;
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

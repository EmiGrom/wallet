package project;

public class WalletPLN extends Wallet {
    private double money;

    public WalletPLN(double money) {
       // moneyType = MoneyType.PLN;
        MoneyType moneyType1 = moneyType.PLN;
        this.money = 200.0;
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

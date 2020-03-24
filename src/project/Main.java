package project;
import java.util.Scanner;
public class Main {////666
    public static void main(String[] args) {//psvm
        Scanner scanner = new Scanner(System.in);
        System.out.println("witaj w moim portfelu: najpierw wybierz walute:\n 1.PLN\n 2.EUR\n 3.USD");
        int typ = scanner.nextInt();

        System.out.println("ilość pieniędzy");
        Wallet wallet = null;
        double money = scanner.nextDouble();

        switch (typ) {
            case 1:
                wallet = new WalletPLN(money);
                break;
            case 2:
                wallet = new WalletGR(money);
                break;
            case 3:
                wallet = new WalletKILO(money);
                break;
            default:
                System.out.println("wybór niemożliwy");
                System.out.println(wallet);
        }
        run(scanner, wallet);
    }
    private static void run(Scanner scanner, Wallet wallet) {
        Character operation;
        System.out.println("Podaj rodzaj operacji: \n + wpłacanie \n - wypłacanie \n x koniec/powrót ");
        operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                double moneyTym = scanner.nextDouble();
                wallet.addMoney(moneyTym);
                System.out.println(wallet);
                break;
            case '-':
                moneyTym = scanner.nextDouble();
                wallet.spendingMoney(moneyTym);
                System.out.println(wallet);
                break;
            case 'x':
                return;
            default:
                System.out.println("wybór niemożliwy");
                System.out.println(wallet);
        }
        run(scanner, wallet);
    }
}

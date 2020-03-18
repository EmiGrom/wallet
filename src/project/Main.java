package project;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {//psvm

        Scanner scanner = new Scanner(System.in);
        System.out.println("witaj w moim portfelu: najpierw wybierz walute:\n 1.PLN\n 2.EUR\n 3.USD");
        int typ = scanner.nextInt();

        System.out.println("ilość pieniędzy");
        double money = scanner.nextDouble();
        Wallet wallet = null;
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
        }
        run(scanner, wallet);
    }

    private static void run(Scanner scanner, Wallet wallet) {


    }
}
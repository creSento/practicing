package more;

import java.util.Scanner;

public class Test0310 {

	public static void main(String[] args) {
		Vending vending = new Vending(0, 0, 0);
		vending.printMenu(2000, 0, 0, 0);

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int balance = 0;
		int coke = 0;
		int juice = 0;
		int milk = 0;
		
		while (num != 0) {	// keep choose menu until input 0
			if (num == 1) {
				vending.setCoke(++coke);
				balance = vending.BALANCE - vending.total(coke, juice, milk);
				vending.setBal(balance);
				coke = vending.getCoke();
				juice = vending.getJuice();
				milk =  vending.getMilk();
				balance = vending.getBal();
				vending.printMenu(balance, coke, juice, milk);
				num = sc.nextInt();	// choose another menu
			}
			if (num == 2) {
				vending.setJuice(++juice);
				balance = vending.BALANCE - vending.total(coke, juice, milk);
				vending.setBal(balance);
				coke = vending.getCoke();
				juice = vending.getJuice();
				milk =  vending.getMilk();
				balance = vending.getBal();
				vending.printMenu(balance, coke, juice, milk);
				num = sc.nextInt();
			}
			if (num == 3) {
				vending.setMilk(++milk);
				balance = vending.BALANCE - vending.total(coke, juice, milk);
				vending.setBal(balance);
				coke = vending.getCoke();
				juice = vending.getJuice();
				milk =  vending.getMilk();
				balance = vending.getBal();
				vending.printMenu(balance, coke, juice, milk);
				num = sc.nextInt();
			}
			if (num == 4) {
				vending.setCoke(0);
				vending.setJuice(0);
				vending.setMilk(0);
				vending.setBal(2000);
				coke = vending.getCoke();
				juice = vending.getJuice();
				milk =  vending.getMilk();
				balance = vending.getBal();
				vending.printMenu(balance, coke, juice, milk);
				num = sc.nextInt();
			}
		}
	}

}

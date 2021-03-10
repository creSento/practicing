package more;

public class Vending {
	final int BALANCE = 2000;
	final int COKEPRICE = 500;
	final int JUICEPRICE = 1000;
	final int MILKPRICE = 700;
	private int coke;
	private int juice;
	private int milk;
	private int bal;

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	public int getCoke() {
		return coke;
	}

	public void setCoke(int coke) {
		this.coke = coke;
	}

	public int getJuice() {
		return juice;
	}

	public void setJuice(int juice) {
		this.juice = juice;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public Vending(int coke, int juice, int milk) {
		this.coke = coke;
		this.juice = juice;
		this.milk = milk;
	}
	
	public int total(int coke, int juice, int milk) {
		return (COKEPRICE * coke) + (JUICEPRICE * juice) + (MILKPRICE * milk);
	}
	public void printMenu(int balance, int coke, int juice, int milk) {
		System.out.println("#Vending machine");
		System.out.println("1. Coke - 500");
		System.out.println("2. Juice - 1000");
		System.out.println("3. Milk - 700");
		System.out.println("4. Calcel All");
		System.out.println("*Balance : " + balance);
		System.out.println("Coke["+coke+"], Juice[" + juice + "], Milke[" + milk +"]");
		
	}
}

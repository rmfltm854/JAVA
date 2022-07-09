package program2;

public class Client {
	
	private Client() {}
	
	private static Client instance = new Client();
	
	public static Client getInstance() {
		return instance;
	}
	
	private int money;

	public int getMoney() {
		return money;
	}

	public void addMoney(int money) {
		this.money += money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}

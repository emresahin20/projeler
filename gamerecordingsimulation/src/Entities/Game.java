package Entities;

import java.time.LocalDate;

public class Game extends Customer{
	
	private String gameName;
	private int price;
	private int discount;
	
	public Game() {}
	
	public Game(int id, String email, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId, int price, int discount, String gameName) {
		super(id, email, firstName, lastName, dateOfBirth, nationalityId);
		this.discount = discount;
		this.price = price;
		this.gameName = gameName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getGameName(){
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
}

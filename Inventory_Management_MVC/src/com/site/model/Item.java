package com.site.model;

public class Item {

	// Attributes
	private int id;
	private String item;
	private int amount;
	private String inside_date;
	private String out_date;
	private String obs;
	
	//constructor
	public Item(int id, String item, int amount, String inside_date, String out_date, String obs) {
		super();
		this.id = id;
		this.item = item;
		this.amount = amount;
		this.inside_date = inside_date;
		this.out_date = out_date;
		this.obs = obs;
	}
	
	public Item() {
		// empty constructor
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getInside_date() {
		return inside_date;
	}

	public void setInside_date(String inside_date) {
		this.inside_date = inside_date;
	}

	public String getOut_date() {
		return out_date;
	}

	public void setOut_date(String out_date) {
		this.out_date = out_date;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
}

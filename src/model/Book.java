package model;

import java.time.LocalDate;

public class Book {
	private int id;
	private String name;
	private float price;
	private LocalDate pub_date;
	int autuor_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public LocalDate getPub_date() {
		return pub_date;
	}
	public void setPub_date(LocalDate pub_date) {
		this.pub_date = pub_date;
	}
	public int getAutuor_id() {
		return autuor_id;
	}
	public void setAutuor_id(int autuor_id) {
		this.autuor_id = autuor_id;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", autuor_id=" + autuor_id + "]";
	}
	
	
	

}

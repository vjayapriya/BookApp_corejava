package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {
	private int id;
	private int quantity;
	private int userId;
	private String username;
	private int bookId;
	@Override
	public String toString() {
		return "Order [id=" + id + ", quantity=" + quantity + ", userId=" + userId + ", username=" + username
				+ ", bookId=" + bookId + ", status=" + status + ", orderedDate=" + orderedDate + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private String status;
	private LocalDateTime orderedDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getOrderedDate() {
		return orderedDate;
	}
	public void setOrderedDate(LocalDateTime orderedDate) {
		this.orderedDate = orderedDate;
	}
	
	
}
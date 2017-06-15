package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Book;
import util.ConnectionUtil;


public class BookDAO {
	public void register(Book book) throws Exception {
		String sql = "insert into books(name,price,pub_date,author_id)values(?,?,?,?)";

		Connection con = ConnectionUtil.getConnection();
		System.out.println("Conn:" + con);
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, book.getName());
		pst.setFloat(2,book.getPrice());
		pst.setDate(3, Date.valueOf(book.getPub_date()));
		pst.setInt(4, book.getAutuor_id());
		
		

		int rows = pst.executeUpdate();
		System.out.println(rows);

		System.out.println("BookDAO-> register: " + book);
	}
	public void listbook() throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String sql = "select id,name,price,author_id,pub_date from books";
		PreparedStatement pst = con.prepareStatement(sql);
		List<Book> booklist = new ArrayList<Book>();
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int price = rs.getInt("price");
			int authour_id = rs.getInt("author_id");
			Date pub_date = rs.getDate("date");
			Book book = new Book();
			book.setName(name);
			book.setPrice(price);
			book.setAutuor_id(authour_id);
			book.setPub_date(pub_date.toLocalDate());
			booklist.add(book);
		}
		System.out.println(booklist);
		for (Book book : booklist) {
			System.out.println(book);
		}
		

	}

}

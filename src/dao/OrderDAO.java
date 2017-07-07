package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import model.Order;
import util.ConnectionUtil;


public class OrderDAO {
		public void register(Order order) throws Exception {
			String sql = "insert into orders(quantity,user_id,book_id)values(?,?,?)";

			Connection con = ConnectionUtil.getConnection();
			System.out.println("Conn:" + con);
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1,order.getQuantity());
			pst.setInt(2, order.getUserId());
			pst.setInt(3,order.getBookId());
			
			
			int rows = pst.executeUpdate();
			System.out.println(rows);

			System.out.println("OrderDAO-> register: " + order);
		}
		 public List<Order> listorderold() throws Exception{
			 Connection con = ConnectionUtil.getConnection();
			 String sql = "select id, user_id ,book_id,quantity,status,Ordered_date from orders";
			 PreparedStatement pst=con.prepareStatement(sql);
			 List<Order> orderList = new ArrayList<Order>();
			 
			 ResultSet rs =pst.executeQuery();
			 while(rs.next()){
				 int id =rs.getInt("id");
				 int user_id =rs.getInt("user_id");
				 int book_id =rs.getInt("book_id");
				 int quantity =rs.getInt("quantity");
				 String status=rs.getString("status");
				 Timestamp Ordered_date=rs.getTimestamp("Ordered_date");
				 
				 Order order =new Order();
				 order.setId(id);
				 order.setUserId(user_id);
				 order.setBookId(book_id);
				 order.setQuantity(quantity);
				 order.setStatus(status);
				 order.setOrderedDate(Ordered_date.toLocalDateTime());
				 
				 
				 orderList.add(order);
			 }
			 
			 return orderList;
		 }
			 
				 public List<Order> listorder() throws Exception{
					 Connection con = ConnectionUtil.getConnection();
					 String sql = "select o.id, user_id ,book_id,quantity,status,Ordered_date, p.name as username from orders o,person p where p.id=o.user_id";
					 PreparedStatement pst=con.prepareStatement(sql);
					 List<Order> orderList = new ArrayList<Order>();
					 
					 ResultSet rs =pst.executeQuery();
					 while(rs.next()){
						 int id =rs.getInt("id");
						 int user_id =rs.getInt("user_id");
						 int book_id =rs.getInt("book_id");
						 int quantity =rs.getInt("quantity");
						 String status=rs.getString("status");
						 String username=rs.getString("username");
						 Timestamp Ordered_date=rs.getTimestamp("Ordered_date");
						 
						 Order order =new Order();
						 order.setId(id);
						 order.setUserId(user_id);
						 order.setBookId(book_id);
						 order.setQuantity(quantity);
						 order.setUsername(username);
						 order.setStatus(status);
						 order.setOrderedDate(Ordered_date.toLocalDateTime());
						 
						 
						 orderList.add(order);
}
			 
			 
			 
			 
			 return orderList;
				 }	 }
		
			 	



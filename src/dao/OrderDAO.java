package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Order;
import util.ConnectionUtil;


public class OrderDAO {
		public void register(Order order) throws Exception {
			String sql = "insert into orders(quantity,status,ordered_date,user_id,book_id)values(?,?,?,?,?)";

			Connection con = ConnectionUtil.getConnection();
			System.out.println("Conn:" + con);
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1,order.getQuantity());
			pst.setString(2,order.getStatus());
			pst.setDate(3, Date.valueOf(order.getOrderedDate()));
			pst.setInt(4, order.getUserId());
			pst.setInt(5,order.getBookId());
			
			
			int rows = pst.executeUpdate();
			System.out.println(rows);

			System.out.println("OrderDAO-> register: " + order);
		}
		 public List<Order> listorder() throws Exception{
			 Connection con = ConnectionUtil.getConnection();
			 String sql = "select id, user_id ,book_id,quantity,satus,ordered_date from orders";
			 PreparedStatement pst=con.prepareStatement(sql);
			 List<Order> orderList = new ArrayList<Order>();
			 
			 ResultSet rs =pst.executeQuery();
			 while(rs.next()){
				 int id =rs.getInt("id");
				 int user_id =rs.getInt("user_id");
				 int book_id =rs.getInt("book_id");
				 int quantity =rs.getInt("quantity");
				 String satus =rs.getString("satus");
				 Date ordered_date =rs.getDate("ordered_date");
				 
				 Order order =new Order();
				 order.setId(id);
				 order.setUserId(user_id);
				 order.setBookId(book_id);
				 order.setQuantity(quantity);
				 order.setStatus(satus);
				 order.setOrderedDate(ordered_date.toLocalDate());
			
				 
				 
				 orderList.add(order);
			 }
			 
			 
			 
			 
			 return orderList;
	}
		}	 
			 	



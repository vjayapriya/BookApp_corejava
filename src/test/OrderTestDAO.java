package test;



import java.time.LocalDate;

import dao.OrderDAO;
import model.Order;

public class OrderTestDAO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Order order=new model.Order();
order.setQuantity('2');
order.setStatus("delivery");
LocalDate date=LocalDate.parse("2017-06-29");
order.setOrderedDate(date);
order.setUserId(3);
order.setBookId(3);

OrderDAO orderDAO = new OrderDAO();
orderDAO.register(order);
System.out.println(order);

	}

}

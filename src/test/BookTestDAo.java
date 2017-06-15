package test;

import java.time.LocalDate;

import dao.BookDAO;
import model.Book;


public class BookTestDAo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setName("java");
		book.setPrice(200);
		LocalDate date=LocalDate.parse("2017-06-29");
		book.setPub_date(date);
		book.setAutuor_id(3);
		

		BookDAO bookDAO = new BookDAO();
		//bookDAO.register(book);
		System.out.println(book);
bookDAO.listbook();
			}


	

}

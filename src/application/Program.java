package application;

import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
			
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", ld, 3000., obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(obj);
		System.out.println(seller);
	}
}
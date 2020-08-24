package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=================Find by department===");
		Department department = new Department(2,null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=================Find All");
		
		
		list = sellerDao.findall();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
   System.out.println("\n=================Seller Insert");
	  Seller	newSeller = new Seller
			(null, "Bob Dylar","bodylan@gmail.com", new Date(), 21000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = "+ newSeller.getId());
		
		
		
	}

}

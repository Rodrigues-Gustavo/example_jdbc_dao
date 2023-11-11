package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department d = new Department(1, "sneakers");
		
		Seller seller = new Seller(22, "javaboy", "javaboy@gmail.com", new Date(), 10000.0, d);
		System.out.println(seller);
	}
}

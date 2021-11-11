package nLeyeredDemo;

import nLeyeredDemo.business.abstracts.ProductService;
import nLeyeredDemo.business.concretes.ProductManager;
import nLeyeredDemo.core.JLoggerManagerAdapter;
import nLeyeredDemo.dataAccess.concretes.AbcProductDao;
import nLeyeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Elma",12,50);
		
		productService.add(product);
		
		
	}

}

package oopintro;

public class Main {

	public static void main(String[] args) {
		
		Product product1= new Product(1,"Apple MacbookAir M1", 15000 , "M1 8 Gb Ram" );
		
		
		Product product2= new Product();
		product2.id=2;
		product2.name="Apple MacBook Pro M1";
		product2.priceStock=20000;
		product2.discount="M1 16 Gb Ram";
		
		Product[] products = {product1,product2};
		
		System.out.println(products.length);
		
		for(Product product : products )
			System.out.println(product.name);
		
		 ProductManager productManager=new ProductManager();
		 productManager.categoryName="Elektronik";
		 productManager.categoryId=1;
		 
		 System.out.println(productManager.categoryName);
		 
	}

}

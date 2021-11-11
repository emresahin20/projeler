 package nLeyeredDemo.business.concretes;

import java.util.List;

import nLeyeredDemo.business.abstracts.ProductService;
import nLeyeredDemo.core.LoggerService;
import nLeyeredDemo.dataAccess.abstracts.ProductDao;
import nLeyeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao , LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println(" Bu Kategory Ürün Kabul Etmiyor");
			return;
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklenid : " + product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

package oopWithNLayeredApp;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entites.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhone XR", 9000);
		
		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new DatabaseLogger());
		loggers.add(new FileLogger());
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers );
		productManager.add(product1);
	}

}

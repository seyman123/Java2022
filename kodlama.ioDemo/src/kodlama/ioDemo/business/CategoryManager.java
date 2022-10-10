package kodlama.ioDemo.business;

import kodlama.ioDemo.core.logging.Logger;
import kodlama.ioDemo.dataAccess.CategoryDao;
import kodlama.ioDemo.entites.Category;

public class CategoryManager {
	
	CategoryDao categoryDao;
	Logger logger;
	
	public CategoryManager(CategoryDao categoryDao, Logger logger) {
		this.categoryDao = categoryDao;
		this.logger = logger;
	}
	
	public void add(Category category) {
		for(Category c : categoryDao.getAllCategories()) {
			
			if (c.getName().equals(category.getName())) {
				System.out.println("Aynı isimde kategori bulunamaz");
			}
		}
		
		categoryDao.add(category);
		logger.log(category.getName() + " adlı kategori eklendi");
	}
	
	public void delete(Category category) {
		categoryDao.delete(category);
	}
	
	public void update(Category category) {
		categoryDao.update(category);
	}

}
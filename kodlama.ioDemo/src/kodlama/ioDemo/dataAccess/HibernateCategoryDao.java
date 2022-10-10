package kodlama.ioDemo.dataAccess;

import java.util.ArrayList;
import java.util.List;

import kodlama.ioDemo.entites.Category;

public class HibernateCategoryDao implements CategoryDao{
	
	List<Category> categories = new ArrayList<>();

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile Kategori veritabanına eklendi : " + category.getName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile Kategori veritabanından silindi : " + category.getName());		
	}

	@Override
	public void update(Category category) {
		System.out.println("Hibernate ile Kategori veritabanına güncellendi : " + category.getName());		
	}

	@Override
	public List<Category> getAllCategories() {
		return categories;
	}

}

package kodlama.ioDemo.dataAccess;

import java.util.ArrayList;
import java.util.List;

import kodlama.ioDemo.entites.Category;

public class JdbcCategoryDao implements CategoryDao{
	
	private List<Category> categories = new ArrayList<>();

	@Override
	public void add(Category category) {
		System.out.println("Kategori JDBC ile veritabanına eklendi : " + category.getName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Kategori JDBC ile veritabanından silindi : " + category.getName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Kategori JDBC ile veritabanına güncellendi : " + category.getName());		
	}

	@Override
	public List<Category> getAllCategories() {
		return categories;
	}

}

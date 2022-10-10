package kodlama.ioDemo.dataAccess;

import java.util.List;

import kodlama.ioDemo.entites.Category;

public interface CategoryDao {
	void add(Category category);
	void delete(Category category);
	void update(Category category);
	List<Category> getAllCategories();
}

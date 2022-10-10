package kodlama.ioDemo;



import kodlama.ioDemo.business.CategoryManager;
import kodlama.ioDemo.business.CourseManager;
import kodlama.ioDemo.business.InstructorManager;
import kodlama.ioDemo.core.logging.DatabaseLogger;
import kodlama.ioDemo.core.logging.FileLogger;
import kodlama.ioDemo.core.logging.MailLogger;
import kodlama.ioDemo.dataAccess.HibernateCategoryDao;
import kodlama.ioDemo.dataAccess.HibernateCourseDao;
import kodlama.ioDemo.dataAccess.HibernateInstructorDao;
import kodlama.ioDemo.dataAccess.JdbcCategoryDao;
import kodlama.ioDemo.dataAccess.JdbcCourseDao;
import kodlama.ioDemo.dataAccess.JdbcInstructorDao;
import kodlama.ioDemo.entites.Category;
import kodlama.ioDemo.entites.Course;
import kodlama.ioDemo.entites.Instructor;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("Java");
		course1.setPrice(250);
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Programlama");

		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setName("Engin Demirop");
		instructor1.setSalary(10000);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), new DatabaseLogger());
		courseManager.add(course1);
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), new MailLogger());
		categoryManager.add(category1);
		
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), new FileLogger());
		instructorManager.add(instructor1);
		
		HibernateCategoryDao categoryDao = new HibernateCategoryDao();
		System.out.println(categoryDao.getAllCategories()); 
		
		
	}

}

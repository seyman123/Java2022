package kodlama.ioDemo.dataAccess;

import kodlama.ioDemo.entites.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına eklendi : " + course.getName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Hibernate ile veritabanından silindi : " + course.getName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Hibernate ile veritabanına güncellendi : " + course.getName());
		
	}

}

package kodlama.ioDemo.dataAccess;

import kodlama.ioDemo.entites.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veritabanına eklendi : " + course.getName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("JDBC ile veritabanından silindi : " + course.getName());
	}

	@Override
	public void update(Course course) {
		System.out.println("JDBC ile veritabanına güncellendi : " + course.getName());
		
	}

}

package kodlama.ioDemo.dataAccess;

import kodlama.ioDemo.entites.Course;

public interface CourseDao {
	void add(Course course);
	void delete(Course course);
	void update(Course course);
}

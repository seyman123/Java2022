package kodlama.ioDemo.business;

import kodlama.ioDemo.core.logging.Logger;
import kodlama.ioDemo.dataAccess.CourseDao;
import kodlama.ioDemo.entites.Course;

public class CourseManager {
	
	CourseDao courseDao;
	Logger logger;
	
	public CourseManager(CourseDao courseDao, Logger logger) {
		this.courseDao = courseDao;
		this.logger = logger;
	}
	
	public void add(Course course) {
		if (course.getPrice() > 0) {
			courseDao.add(course);
			logger.log("log mesajı");
		}else {
			System.out.println("Girilen bilgiler geçersizdir");
		}
	}
	
	public void delete(Course course) {
		courseDao.delete(course);
	}
	
	public void update(Course course) {
		courseDao.update(course);
	}
}

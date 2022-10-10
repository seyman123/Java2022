package kodlama.ioDemo.business;

import kodlama.ioDemo.core.logging.Logger;
import kodlama.ioDemo.dataAccess.InstructorDao;
import kodlama.ioDemo.entites.Instructor;

public class InstructorManager {
	
	InstructorDao instructorDao;
	Logger logger;
	
	public InstructorManager(InstructorDao instructorDao, Logger logger) {
		this.instructorDao = instructorDao;
		this.logger = logger;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		logger.log("loglamala mesajı");
	}
	
	public void delete(Instructor instructor) {
		instructorDao.delete(instructor);
	}
	
	public void update(Instructor instructor) {
		instructorDao.update(instructor);
	}
}

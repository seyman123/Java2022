package kodlama.ioDemo.dataAccess;

import kodlama.ioDemo.entites.Instructor;

public interface InstructorDao {
	void add(Instructor instructor);
	void delete(Instructor instructor);
	void update(Instructor instructor);
}

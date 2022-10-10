package kodlama.ioDemo.dataAccess;

import kodlama.ioDemo.entites.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen JDBC ile veritabanına eklendi : " + instructor.getName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Eğitmen JDBC ile veritabanından silindi : " + instructor.getName());
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Eğitmen JDBC ile veritabanına güncellendi : " + instructor.getName());
		
	}

}

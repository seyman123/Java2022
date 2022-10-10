package kodlama.ioDemo.dataAccess;

import kodlama.ioDemo.entites.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile veritabanına eklendi : " + instructor.getName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile veritabanından silindi : " + instructor.getName());
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile veritabanına güncellendi : " + instructor.getName());
		
	}

}

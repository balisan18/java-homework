package KodlamaIOFirstProje.dataAccess;

import KodlamaIOFirstProje.entities.Category1;
import KodlamaIOFirstProje.entities.Course;
import KodlamaIOFirstProje.entities.Instructor;

public class JbcdSectionsDao implements SectionsDao {

	@Override
	public void add(Category1 category, Course course, Instructor instructor) {
		System.out.println("Jbcd ile veritabanına eklendi");
		
	}



}

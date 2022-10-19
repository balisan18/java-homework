package KodlamaIOFirstProje.dataAccess;

import KodlamaIOFirstProje.entities.Category1;
import KodlamaIOFirstProje.entities.Course;
import KodlamaIOFirstProje.entities.Instructor;

public class HibernateSectionDao implements SectionsDao {

	@Override
	public void add(Category1 category, Course course, Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}


}

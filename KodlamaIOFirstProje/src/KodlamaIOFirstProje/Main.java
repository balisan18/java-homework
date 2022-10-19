package KodlamaIOFirstProje;

import java.util.Locale.Category;

import KodlamaIOFirstProje.business.SectionsManager;
import KodlamaIOFirstProje.core.logging.DatabaseLogger;
import KodlamaIOFirstProje.core.logging.FileLogger;
import KodlamaIOFirstProje.core.logging.Logger;
import KodlamaIOFirstProje.dataAccess.HibernateSectionDao;
import KodlamaIOFirstProje.dataAccess.SectionsDao;
import KodlamaIOFirstProje.entities.Category1;
import KodlamaIOFirstProje.entities.Course;
import KodlamaIOFirstProje.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course();
		course1.setId(1);
		course1.setCourseName("java");
		course1.setCourseType("yazılım");
		course1.setPrice(10);
		
		Category1 category1 = new Category1();
		category1.setId(1);
		category1.setCategoryName("Programlama");
		
	
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setInstructorFirstName("berkay");
		instructor.setInstructorLastName("alişan");
		
		
		
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger()};
		
		
		SectionsManager sectionsManager = new SectionsManager(new HibernateSectionDao(), loggers);
		sectionsManager.add(course1);
		sectionsManager.add(category1);
		sectionsManager.add(instructor);

	}

}

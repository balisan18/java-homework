package KodlamaIOFirstProje.business;

import java.util.ArrayList;
import java.util.List;

import KodlamaIOFirstProje.core.logging.Logger;
import KodlamaIOFirstProje.dataAccess.SectionsDao;
import KodlamaIOFirstProje.entities.Category;
import KodlamaIOFirstProje.entities.Category1;
import KodlamaIOFirstProje.entities.Course;
import KodlamaIOFirstProje.entities.Instructor;

public class SectionsManager {
	private SectionsDao sectionsDao;
	private Logger[] loggers;

	public SectionsManager(SectionsDao sectionsDao, Logger[] loggers) {
		this.sectionsDao = sectionsDao;
		this.loggers = loggers;
	}

	List<Category1> categories = new ArrayList<>();
	List<Course> courses = new ArrayList<>();

	public void add(Course course) throws Exception {
		//iş kuralları
		if(course.getPrice()<0 ) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
		}
		
		for (Course course2 : courses) {
			if(course2.getCourseName().equals(course.getCourseName())) {
				throw new Exception(" Kurslar aynı adı taşıyamaz."); 
			}
		}

		courses.add(course);
		
		sectionsDao.add(null, course, null);
		
		for (Logger logger : loggers) {//[Db,file]
			logger.log(course.getCourseName());
		}
	}
	public void add(Category1 category1) throws Exception {
		//iş kuralları
		for (Category1 category2 : categories) {
			if (category2.getCategoryName().equals(category1.getCategoryName())) {
				throw new Exception("kurs ismi iki kez tekrar edemez.");
			}
		}

		categories.add(category1);
		
		sectionsDao.add(category1, null, null);
		
		for (Logger logger : loggers) {//[Db,file]
			logger.log(category1.getCategoryName());
		}
	}
	

	public void add(Instructor instructor) {
		sectionsDao.add(null, null, instructor);
		for (Logger logger : loggers) {//[Db,file]
			logger.log(instructor.getInstructorFirstName());
			logger.log(instructor.getInstructorLastName());
		}
	}

}

package KodlamaIOFirstProje.dataAccess;



import KodlamaIOFirstProje.entities.Category1;
import KodlamaIOFirstProje.entities.Course;
import KodlamaIOFirstProje.entities.Instructor;

public interface SectionsDao {
	void add(Category1 category,Course course,Instructor instructor);

}


public class Main {

	public static void main(String[] args) {
Course course1 = new Course(1, "Yaz�l�mc� Gelistirme Kamp� (C# + ANGULAR)", "Engin Demirog");
		
		
		Course course2 = new Course();
		course2.id = 2	;
		course2.name = "Yaz�l�mc� Gelistirme Kamp� (JAVA + REACT)";
		course2.detail= "Java + React ";
		
		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Programlamaya Giris i�in Temel Kurs";
		course3.detail= "Temel Kurs ";
		
		Course courses[] = {course1, course2,course3};
		for (Course course : courses) {
			System.out.println(course.name);
			}
		
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Kurslar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "T�m Kurslar";
		
		
		
		Category categories[] = {category1, category2};
		for (Category category : categories) {
			System.out.println(category.name);
			}
		

		
	}
	

}

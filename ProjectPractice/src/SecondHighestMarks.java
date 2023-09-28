import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestMarks {
	public static void main(String[] args) {
		List<Student> studentData=Arrays.asList(
				new Student("Krishna",78, 89, 90),
				new Student("Sriram", 67, 88, 76),
				new Student("Narasimha", 90, 97, 60),
				new Student("Shiva", 95, 97, 98),
				new Student("Vishnu", 92, 99, 99),
				new Student("Brahma", 94, 90, 78)
				);  
	
	int secondhighestMarks=studentData.stream()
			.mapToInt(Student::getEnglishMarks)
			.distinct()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst()
			.orElse(-1);
	System.out.println("second heghest marks in english:");
	studentData.stream()
	 .filter(student-> student.getEnglishMarks()==secondhighestMarks)
	 .forEach(System.out::println);
}
}

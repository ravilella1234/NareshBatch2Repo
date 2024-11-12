package icici.loans.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingStudentsbyGrade 
{
	public static void main(String[] args) 
	{
        Map<String, List<String>> gradeStudents = new HashMap<>();
        gradeStudents.put("Grade 10", new ArrayList<>());
        gradeStudents.put("Grade 11", new ArrayList<>());

        gradeStudents.get("Grade 10").add("Alice");
        gradeStudents.get("Grade 10").add("Bob");
        gradeStudents.get("Grade 11").add("Charlie");

        System.out.println("Students grouped by grade: " + gradeStudents);
    }
}

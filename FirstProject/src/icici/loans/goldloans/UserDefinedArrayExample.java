package icici.loans.goldloans;

import java.util.Scanner;

public class UserDefinedArrayExample 
{

	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Define the size of the array
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array of Student objects
        Student[] students = new Student[numberOfStudents];

        // Input details for each student
        for (int i = 0; i < numberOfStudents; i++) 
        {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Roll Number: ");
            String rollNumber = scanner.nextLine();

            // Create a new Student object and add it to the array
            students[i] = new Student(name, age, rollNumber);
        }

        // Display the details of all students
        System.out.println("\nStudent Details:");
        for (Student student : students) 
        {
            student.displayInfo();
        }

        // Close the scanner
        scanner.close();
    }
	
}

package array;

public class StudentArray {
	public static void main(String []args) {
    // Create an array of 5 students
    Student[] students = new Student[5];

    // Initialize students with sample data
    students[0] = new Student(1, "Alice", new Address("Bhopal", "M.P", "12345"));
    students[1] = new Student(2, "Bob", new Address("Indore", "M.P", "67890"));
    students[2] = new Student(3, "Charlie", new Address("Ujjain", "M.P", "54321"));
    students[3] = new Student(4, "David", new Address("Sehore", "M.P", "98765"));
    students[4] = new Student(5, "Eve", new Address("Sagar", "M.P", "13579"));


}
}
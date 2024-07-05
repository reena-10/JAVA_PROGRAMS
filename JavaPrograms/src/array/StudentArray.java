package array;

public class StudentArray {
	public static void main(String []args) {
    // Create an array of 5 students
    Student[] students = new Student[5];

    // Initialize students with  data
    students[0] = new Student(1, "Reena", new Address("Bhopal", "M.P", "12345"));
    students[1] = new Student(2, "Mithlesh", new Address("Indore", "M.P", "67890"));
    students[2] = new Student(3, "Akhilesh", new Address("Patna", "Bihar", "54321"));
    students[3] = new Student(4, "Kavita", new Address("Tata", "Jharkhand", "98765"));
    students[4] = new Student(5, "Mukesh", new Address("Sagar", "M.P", "13579"));
    students[4].getAddress().setCity("Madhubani");
    students[4].getAddress().setState("Bihar");
    students[4].getAddress().setPincode("54321");

    System.out.println("Update Data");
    for (Student student : students) {
        System.out.println("ID: " + student.getId() + ", Name: " + student.getName() +
                ", Address: " + student.getAddress().getCity() + ", " +
                student.getAddress().getState() + " " + student.getAddress().getPincode());
    }


}
}
// Professor | Department | University | UniversityArray
package array;

public class Professor {
 private int id;
 private String name;
 private String department;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Professor(int id, String name, String department) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
}
@Override
public String toString() {
	return "Professor [id=" + id + ", name=" + name + ", department=" + department + "]";
}
 
}

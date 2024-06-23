package javaBean;
//Java program of JavaBean class

public class Student implements java.io.Serializable {
 private int id;
 private String name;
 
 //Constructor
 public Student() {}
 
 //setter for id
 public void setId(int id) {
	 this.id=id;
 }
 
 //getter for id
 public int getId() {
	 return id;
 }
 
 //setter for Name
 public void setName(String name) {
	 this.name=name;
 }
 
 //getter for Name
 public String getName() {
	 return name;
 }
}

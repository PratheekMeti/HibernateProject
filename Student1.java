package hibernateproject.com.Learnhibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student1 
{
@Id
int rollno;
String name;
int marks1;
int marks2;
int marks3;
public Student1() 
{
	
}
public Student1(int rollno, String name, int marks1, int marks2, int marks3) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.marks1 = marks1;
	this.marks2 = marks2;
	this.marks3 = marks3;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks1() {
	return marks1;
}
public void setMarks1(int marks1) {
	this.marks1 = marks1;
}
public int getMarks2() {
	return marks2;
}
public void setMarks2(int marks2) {
	this.marks2 = marks2;
}
public int getMarks3() {
	return marks3;
}
public void setMarks3(int marks3) {
	this.marks3 = marks3;
}
@Override
public String toString() {
	return "Student1 [rollno=" + rollno + ", name=" + name + ", marks1=" + marks1 + ", marks2=" + marks2 + ", marks3="
			+ marks3 + "]";
}

}

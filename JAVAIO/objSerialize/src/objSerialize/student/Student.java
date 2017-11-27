package objSerialize.student;

import java.io.Serializable;

public class Student implements Comparable<Student>,Serializable {
	private static final long serialVersionUID = 1235L;
	private long studentID;
	private String name;
	private String sex;
	public Student(long a,String b,String c){
		studentID = a;
		name = b;
		sex = c;
	}
	public long getStudentID() {
		return studentID;
	}
	public void setStudentID(long studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public int compareTo(Student o) {
		int result = studentID > o.studentID ? 1 : (studentID == o.studentID ? 0 : -1);
		return result;
	}
	@Override
	public String toString() {
		return studentID + "  " + name + "     " + sex;
	}
}

package com.seenu.Rest_Simple_Demo.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Student_Service {
	
	public static List<Student> students  = new ArrayList<>();
	private static int count;
	
	static {
		students.add(new Student(101,"seenu", "hyderabad"));
		students.add(new Student(123,"suvvy", "mandamari"));
		students.add(new Student(143,"bugga", "adilpet"));
		students.add(new Student(786,"akhil", "nirmal"));
	}
	
	public List<Student> FindAll() {
		return students;
	}
	public Student save(Student stud) {
		if(stud.id==null) {
			stud.setId(++count);
		}
		students.add(stud);
		return stud;
	}
	
	public Student FindOne(int id) {
		for(Student stud:students) {
			if(stud.getId()==id) {
				return stud;
			}
		}
		return null;
	}

	public Student Delete(int id) {
		Iterator<Student> iterat = students.iterator();
		while(iterat.hasNext()) {
//			iterat.remove();
			Student student = iterat.next();
			if(student.getId()==id) {
				iterat.remove();
			}
		}
		return null;
				}
}

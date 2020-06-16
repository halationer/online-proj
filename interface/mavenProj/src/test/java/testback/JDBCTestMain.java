package testback;

import java.util.*;
import dao.*;
import web.*;

public class JDBCTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��
		SqlVisiter.executeUpdate(
			"insert into students (student_id, name, point) value(?,?,?)",
			"170105040007",
			"С����",
			88.32
		);
		
		List<Student> students = SqlVisiter.executeQuery(
				"select * from students",
				Student.class
		);
		for(Student student : students)
			System.out.println(student.toString());
		
		//ɾ
		SqlVisiter.executeUpdate("delete from students where name=?", "С����");
		
		//��
		SqlVisiter.executeUpdate("update students set point=? where name=?", 66.66, "���");
		
		//��
		List<Student> stuwen = SqlVisiter.executeQuery(
			"select * from students where name=?",
			Student.class,
			"���"
		);
		
		for(Student student : stuwen)
			System.out.println(student.toString());
	}

}

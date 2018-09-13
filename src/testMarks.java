package peerGradingSystem;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class testMarks {
	studentList sltest= new studentList();
	ArrayList<student> studentsMarks=new ArrayList<>();
	String studentNames[] = {"a","b","c","d","e","f","g"};
	@Test
	public void testStudentList() {
		//fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetStudentsList() {
		//fail("Not yet implemented");
	}

	@Test
	public void testInitStudentList() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCalculateNormalisedMarks() {
		//fail("Not yet implemented");

		student stu1=new student("Mitali", 10);
		student stu2=new student("Sumedh", 11);
		student stu3=new student("Kaushik", 12);
		sltest.add(stu1);
		sltest.add(stu2);
		sltest.add(stu3);
		int marks= sltest.calculateNormalisedMarks();
		assertNotEquals(0, marks);
		
	}

}

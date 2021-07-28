package application;

import java.util.*;

/**
 * The Semester class will represent a Course object.
 * This class contains information about 
 * the semester credit hours, semester GPA, along with all the courses in each semester
 * @author Tyler Nguyen
 * @author Gabby Mapa
 * @author Emily Nguyen
 *
 */

public class Semester 
{
	private ArrayList<Course> courses;
	private int creditHours;
	private double semesterGPA;
	private double semesterPoints;
	
	public Semester() 
	{
		courses = new ArrayList<Course>();
		creditHours = 0;
		semesterGPA = 0.0;
		semesterPoints = 0.0;
	}
	
	public void addCourse(Course myCourse)
	{
		courses.add(myCourse);
	}
	
	public void calculateSemesterGPA()
	{
		// re-initialize to 0 to calculate
		this.creditHours = 0;
		this.semesterPoints = 0.0;
		
		// formula
		// Semester GPA = (course GPA * course credit hours) / semester credit hours
		//				= semester points / semester credit hours
		
		// find the total points and total credit hours for the semester
		for (int i = 0; i < courses.size(); i++)
		{
			this.semesterPoints += ( courses.get(i).getGradePoints() * courses.get(i).getCreditHours() );
			this.creditHours += courses.get(i).getCreditHours();
		}
		
		// calculate semester GPA
		this.semesterGPA = this.semesterPoints / this.creditHours;
	}
	
	public int getCreditHours()	{
		calculateSemesterGPA();
		return creditHours;
	}
	
	public double getSemesterGPA()	{
		calculateSemesterGPA();
		return semesterGPA;
	}
	
	public double getSemesterPoints()	{
		calculateSemesterGPA();
		return semesterPoints;
	}
	
	public ArrayList<Course> getCourses()	{
		return courses;
	}

	public void setCreditHours(int creditHours)	{
		this.creditHours = creditHours;
	}

	public void setSemesterGPA(double semesterGPA)	{
		this.semesterGPA = semesterGPA;
	}

	public void setSemesterPoints(double semesterPoints) {
		this.semesterPoints = semesterPoints;
	}
	
	public void setCourses(ArrayList<Course> courses)	{
		this.courses = courses;
	}
}

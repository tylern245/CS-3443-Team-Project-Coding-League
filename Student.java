package application;

import java.util.*;


/**
 * The Semester class will represent a Course object.
 * This class contains information about the student's 
 * total credit hours and cumulative GPA, along with all the student's courses
 * @author Tyler Nguyen
 * @author Gabby Mapa
 * @author Emily Nguyen
 *
 */

public class Student 
{
	private ArrayList<Course> courses;
	private int totalCreditHours;
	private double cumulativeGPA;
	private double totalPoints;

	public Student() 
	{
		courses = new ArrayList<Course>();
	}
	
	public void addCourse(Course myCourse)
	{
		courses.add(myCourse);
	}
	
	public void calculateCumulativeGPA()
	{
		// re-initialize to 0 to calculate
		this.totalPoints = 0.0;
		this.totalCreditHours = 0;
		
		// formula
		// cumulativeGPA	= (courseGPA * course credit hours) / totalCredits
		//					= totalPoints / totalCreditHours

		// find the total points and total credit hours for student's lifetime
		for (int i = 0; i < courses.size(); i++)
		{
//			this.totalPoints += ( semesters.get(i).getSemesterGPA() * semesters.get(i).getCreditHours() );
//			this.totalCreditHours += semesters.get(i).getCreditHours();
			
			this.totalPoints += ( courses.get(i).getGradePoints() * courses.get(i).getCreditHours() );
			this.totalCreditHours += courses.get(i).getCreditHours();
		}
		
		// calculate cumulative GPA
		this.cumulativeGPA = this.totalPoints / this.totalCreditHours;
	}
	
	
	public double getCumulativeGPA() {
		calculateCumulativeGPA();
		return cumulativeGPA;
	}
	
	public int getTotalCreditHours() {
		calculateCumulativeGPA();
		return totalCreditHours;
	}
	
	public double getTotalPoints() {
		calculateCumulativeGPA();
		return totalPoints;
	}
	
	public ArrayList<Course> getCourses()	{
		return courses;
	}
	
	
	public void setCumulativeGPA(double cumulativeGPA) {
		this.cumulativeGPA = cumulativeGPA;
	}
	
	public void setTotalCreditHours(int totalCreditHours) {
		this.totalCreditHours = totalCreditHours;
	}
	
	public void setTotalPoints(double totalPoints) {
		this.totalPoints = totalPoints;
	}
	
	public void setCourses(ArrayList<Course> courses)	{
		this.courses = courses;
	}
}

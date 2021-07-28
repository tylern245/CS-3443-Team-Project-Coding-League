package application;

//import java.util.*;

/**
 * The Course class will represent a Course object.
 * Each Course objects contains information about each course:
 * the name, number of credit hours, letter grade, and grade points.
 * @author Tyler Nguyen
 * @author Gabby Mapa
 * @author Emily Nguyen
 *
 */

public class Course 
{
	private String courseName;
	private int creditHours;
	private String letterGrade;
	private double gradePoints;
	
	public Course(String courseName, int creditHours, String letterGrade) 
	{
		this.courseName = courseName;
		this.creditHours = creditHours;
		this.letterGrade = letterGrade;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getCreditHours() {
		return creditHours;
	}
	
	public String getLetterGrade()	{
		return letterGrade;
	}
	
	public double getGradePoints()
	{
		// determine grade points based on letter grade
		switch (letterGrade)
		{
			case "A+": gradePoints = 4.0;
				break;
			case "A": gradePoints = 4.0;
				break;
			case "A-": gradePoints = 3.7;
				break;
				
			case "B+": gradePoints = 3.3;
				break;
			case "B": gradePoints = 3.0;
				break;
			case "B-": gradePoints = 2.7;
				break;
			
			case "C+": gradePoints = 2.3;
				break;
			case "C": gradePoints = 2.0;
				break;
			case "C-": gradePoints = 1.7;
				break;
			
			case "D+": gradePoints = 1.3;
				break;
			case "D": gradePoints = 1.0;
				break;
			case "F": gradePoints = 0.0;
				break;

		}
		return gradePoints;
	}
	
	public void setCourseName(String courseName)	{
		this.courseName = courseName;
	}
	
	public void setCreditHours(int creditHours)	{
		this.creditHours = creditHours;
	}
	
	public void setLetterGrade(String letterGrade)	{
		this.letterGrade = letterGrade;
	}
	
	public void setGradePoints(double gradePoints)	{
		this.gradePoints = gradePoints;
	}
	
	
}

package application;

import java.util.*;

/**
 * The Semester class will represent a Course object.
 * This class contains information about the student's 
 * total credit hours, cumulative GPA, along with every semester of the student
 * @author Tyler Nguyen
 * @author Gabby Mapa
 * @author Emily Nguyen
 *
 */

public class Student 
{
	private ArrayList<Semester> semesters;
	private int totalCreditHours;
	private double cumulativeGPA;
	private double totalPoints;

	public Student() 
	{
		semesters = new ArrayList<Semester>();
	}
	
	
	public void addSemester(Semester mySemester)
	{
		semesters.add(mySemester);
	}
	
	public void calculateCumulativeGPA()
	{
		// re-initialize to 0 to calculate
		this.totalPoints = 0.0;
		this.totalCreditHours = 0;
		
		// formula
		// cumulativeGPA	= (semesterGPA * semester credit hours) / totalCredits
		//					= totalPoints / totalCreditHours

		// find the total points and total credit hours for student's lifetime
		for (int i = 0; i < semesters.size(); i++)
		{
			this.totalPoints += ( semesters.get(i).getSemesterGPA() * semesters.get(i).getCreditHours() );
			this.totalCreditHours += semesters.get(i).getCreditHours();
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
	
	public ArrayList<Semester> getSemesters() {
		return semesters;
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
	
	public void setSemesters(ArrayList<Semester> semesters) {
		this.semesters = semesters;
	}
}

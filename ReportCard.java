package udacity.android.basics.com.reportcard;

import java.util.Arrays;

/**
 * {@link ReportCard} represents a report card which would allow a school to store a student’s grades for a particular year.
 */
public class ReportCard {
	// Classes static constants representing each school discipline
	public static final int MATH = 0;
	public static final int LANGUAGE = 1; 
	public static final int PHYSICS = 2; 
	public static final int BIOLOGY = 3; 
	public static final int HISTORY = 4; 
	public static final int ARTS = 5; 
	public static final int GEOGRAFY = 6; 
	public static final int PHYS_EDUCATION = 7; 

	// Grading period static constants representing each quarter period of year
	public static final int Q1 = 0; 
	public static final int Q2 = 1; 
	public static final int Q3 = 2; 
	public static final int Q4 = 3; 

	// Class name which report card is referencing to. Ex: "6th grade"
	private String mClassName;
	// Year of grading period
	private int mYear;
	// Comments made by teacher about student performance
	private String mComments;
	
	/**
	 * Grades for each discipline in each quarter of year
	 * First dimension of array represent disciplines and second dimension represents quarters
	 */
	private String [][] mStudentGrade = new String[8][4];
	
	/**
	 * Class constructor to initialize some state variables
	 * 
	 * @param className is the class name
	 * @param year of grading period
	 */
	public ReportCard(String className, int year){
		mClassName = className;
		mYear = year;
	}
	
	// Get class name
	public String getClassName(){
		return mClassName;
	}
	
	// Get year of grading period
	public int getYear(){
		return mYear;
	}
	
	/**
	 * Allow teacher to set some comments about student's performance
	 * 
	 * @param comments
	 */
	public void setComments(String comments){
		mComments = comments;
	}

	/**
	 * Get teacher's comments about student performance
	 * 
	 * @return mComments
	 */
	public String getComments(){
		return mComments;
	}
	
	/**
	 * Set student's grade for a discipline in a specified quarter of year.
	 * 
	 * The method raises an IndexOutOfBoundsException if the input parameters are out of range of 
	 * mStudentGrade array bounds, so the suggestion is always use the static constants as input parameters.
	 * 
	 * Examples: 
	 * reportCard.setGrade(Report.Card.MATH, Report.Card.Q1, "A+");
	 * reportCard.setGrade(Report.Card.BIOLOGY, Report.Card.Q4, "B-");
	 * 
	 * @param discipline 
	 * @param quarter
	 * @param grade
	 * @throws IndexOutOfBoundsException
	 */
	public void setGrade(int discipline, int quarter, String grade) throws IndexOutOfBoundsException{
		// Raise exceptions with custom messages.
		if(discipline >= mStudentGrade.length) throw new IndexOutOfBoundsException("Discipline " + discipline + " is out of range. Try using static disciplines constants instead."); 
		if(quarter >= mStudentGrade[0].length) throw new IndexOutOfBoundsException("Quarter " + quarter + " is out of range. Try using static quarters constants instead."); 
		
		mStudentGrade[discipline][quarter] = grade;
	}
	
	/**
	 * Get the student's grade in a discipline in a specified quarter of year.
	 * 
	 * The method raises an IndexOutOfBoundsException if the input parameters are out of range of 
	 * mStudentGrade array bounds, so the suggestion is always use the static constants as input parameters.
	 * 
	 * Examples: 
	 * reportCard.getGrade(Report.Card.MATH, Report.Card.Q1);
	 * reportCard.getGrade(Report.Card.BIOLOGY, Report.Card.Q4);
	 * 
	 * @param discipline
	 * @param quarter
	 * @return mStudentGrade[discipline][quarter] is requested grade
	 * @throws IndexOutOfBoundsException
	 */
	public String getGrade(int discipline, int quarter) throws IndexOutOfBoundsException{
		// Raise exceptions with custom messages.
		if(discipline >= mStudentGrade.length) throw new IndexOutOfBoundsException("Discipline " + discipline + " is out of range. Try using static disciplines constants instead."); 
		if(quarter >= mStudentGrade[0].length) throw new IndexOutOfBoundsException("Quarter " + quarter + " is out of range. Try using static quarters constants instead."); 

		return mStudentGrade[discipline][quarter];
	}
	
    /**
    * Returns the string representation of the {@link ReportCard} object.
    * 
    * Here, I've opted to manually list the content of each position in mStudentGrade array instead using Array.toString() implementation
    * to get a better display result.
    * 
    * @return returnString
    */
    @Override
    public String toString() {
        String returnString = "ReportCard{" +
                "mClassName='" + mClassName + '\'' +
                ", mYear=" + mYear +
                ", mComments='" + mComments + '\'';

        for(int i = 0; i < mStudentGrade.length; i++){
        	for(int j = 0; j < mStudentGrade[i].length; j++){
        		returnString += ", mStudentGrade[" + i + "][" + j + "]='" + mStudentGrade[i][j] + '\'';
        	}
        }
        
        return returnString;
    }
}

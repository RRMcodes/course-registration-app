
/** 
 * This is a child class of Course class
 */
public class AcademicCourse extends Course
{
    // private instance variables are declared
    private String lecturer, level, startDate, completionDate; 
    private int assessmentCount, credit;
    private boolean isRegistered; 
    
    /**
     * this is the constructor of AcademicCourse class 
     * 
     * @param courseID,courseName,courseDuration,level,credit,assessmentCount
     */
    public AcademicCourse(String courseID,String courseName,int courseDuration,String level,int credit,int assessmentCount)
    {
        // constructor of super class in called with courseID,courseName,courseDuration as parameters
        super(courseID,courseName,courseDuration);
        // instance variables level,credit,assessmentCount are initialized with arguments of parameters
        this.level = level; 
        this.credit = credit;
        this.assessmentCount = assessmentCount;
        // instance variable lecturer,startDate,completionDate are initialized with empty String
        lecturer = "";
        startDate = "";
        completionDate = "";
        isRegistered = false; // isRegistered is assigned with false boolean value      
    }
    
    /**
     *  This is accessor method for private String lecturer
     *  
     *  @return lecturer
     */
    public String getLecturer()
    {
        return lecturer;
    }
    
    /**
     *  This is accessor method for private String level
     *  
     *  @return level
     */
    public String getLevel()
    {
        return level;
    }
    
    /** 
     * This is accessor method for private String credit
     * 
     * @return credit
     */
    public int getCredit()
    {
        return credit;
    }
    
    /** 
     * This is accessor method for private String startDate
     * 
     * startDate
     */
    public String getStartDate()
    {
        return startDate;
    }
    
    /**
     * This is accessor method for private String completionDate
     * 
     * @return completionDate
     */
    public String getCompletionDate()
    {
        return completionDate;
    }
    
    /**
     * This is accessor method for private int assessmentCount
     * 
     * @return assessmentCount
     */
    public int getAssessmentCount()
    {
        return assessmentCount;
    }
    
    /**
     * This is accessor method for private boolean isRegistered
     * 
     * @return isRegistered
     */
    public boolean getIsRegistered()
    {
        return isRegistered;
    }
    
    /**
     * This is mutator method for private String lecturer
     * 
     * @param lecturer
     */
    public void setLecturer(String lecturer)
    {
        this.lecturer = lecturer; // argument of parameter lecturer to instance variable  lecturer
    }
    
    /**
     * This is mutator method for private int assessmentCount
     * 
     * @param assessmentCount
     */
    public void setAssesamentCount(int assessmentCount)
    {
        this.assessmentCount = assessmentCount; // argument of parameter assessmentCount is assigned to instance variable assessmentCount 
    }
    
    /**
     * This method registers AcademicCourse if it is not registered
     * 
     * @param courseLeader,lecturer,startDate,completionDate
     */
    public void register(String courseLeader, String lecturer, String startDate, String completionDate )
    {
        // checks if course is already registered
        if (isRegistered == true) {
            System.out.println( "The course is already registered with lecturer" + lecturer + " start date " + startDate + " and completion date" + completionDate);
        }
        else{
            super.setCourseLeader(courseLeader);
            this.lecturer = lecturer;
            this.startDate = startDate;
            this.completionDate = completionDate;
            this.isRegistered = true;
        }
    }
    
    /**
     * This method displays lecturer,credit,startDate,completionDate,assessmentCount
     */
    public void display()
    {
        super.display(); // super class method display is called
        // checks if course is already registered
        if (isRegistered == true) {
            System.out.println("The lecturer for this course is " + lecturer + ".");
            System.out.println("This is a level " + level + " course and students are awarded " + credit + " credits after completion.");
            System.out.println("The course starts on " + startDate + " and is completed on " + completionDate + ".");
            System.out.println("This course has " + assessmentCount + " assessments. \n");
        }
    }
}


/** 
 * This is a child class of Course class
 */
public class NonAcademicCourse extends Course
{
    // private instance variables are declared
    private String instructor,startDate,completionDate,examDate,prerequisite;
    private int courseDuration;
    private boolean isRegistered,isRemoved;
    /** 
     * this is the constructor of NonAcademicCourse class 
     * 
     * @param courseID,courseName,courseDuration,prerequisite
     */
    public NonAcademicCourse(String courseID,String courseName,int courseDuration,String prerequisite)
    {
        // constructor of super class in called with courseID,courseName,courseDuration as parameters
        super(courseID,courseName,courseDuration);
        this.prerequisite = prerequisite; // instance variable prerequisite is initialized with argument of parameter 
        // instance variables startDate,completionDate,examDate are initialized with empty strings
        startDate = ""; 
        completionDate = ""; 
        examDate = ""; 
        // isRegistered,isRemoved are assigned with false boolean value
        isRegistered = false; 
        isRemoved = false; 
    }
    
    /** 
     * This is accessor method for private String instructor 
     * 
     * @return instructor
     */
    public String getInstructor()
    {
        return instructor;
    }
    
    /** 
     * This is accessor method for private String startDate
     * 
     * @return startDate
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
     * This is accessor method for private String examDate
     * 
     * @return examDate
     */
    public String getExamDate()
    {
        return examDate;
    }
    
    /** 
     * This is accessor method for private String prerequisite
     * 
     * @return prerequisite
     */
    public String getPrerequisite()
    {
        return prerequisite;
    }
    
    /** 
     * This is accessor method for private int courseDuration
     * 
     * @return courseDuration
     */
    public int getCourseDuration()
    {
        return courseDuration;
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
     * This is accessor method for private boolean isRemoved   '
     * 
     * @return isRemoved
     */
    public boolean getIsRemoved()
    {
        return isRemoved;
    }
    
    /** 
     * This is mutator method for private String instructor which sets instructor name when isRegistered is false 
     * 
     * @param instructor
     */
    public void setInstructor(String instructor)
    {
        // checks if course is already registered
        if (isRegistered == false) {
            this.instructor = instructor; // argument is assigned to instance variable instructor
        }
        else {
            System.out.println("The instructor name cannot be changed."); // this is error message
        }
    }
    
    /** 
     * This method registers a NonAcademicCourse if its is not registered otherwise displays error message
     * 
     * @param courseLeader,instructor,startDate,completionDate,examDate
     */
    public void register(String courseLeader,String instructor,String startDate,String completionDate, String examDate)
    {
        // checks if course is already registered
        if (isRegistered == false) {
            setInstructor(instructor); // setinstructor method is called with instructor as parameter 
            isRegistered = true; // isRegistered is set to true
            super.setCourseLeader(courseLeader);  // setCourseLeader method is called from super class with courseLeader as parameter
            // arguments are assigned to instance variables startDate,completionDate,examDate
            this.startDate = startDate;  
            this.completionDate = completionDate;
            this.examDate = examDate; 
        }
        else{
            System.out.println("cannot register.The non-academic course in already registered."); // this is error message
        }
    }
    
    /** 
     *  This method removes a NonAcademicCoursre if it exists otherwise displays error message  
     */
    public void remove()
    {
        // checks if course is already removed
        if (isRemoved == true) { 
            System.out.println("The non-academic course is already removed"); // this is error message
        }
        else{
            super.setCourseLeader(""); // setCourseLeader method from super class with empty String as parameter
            // startDate,completionDate,examDate are assigned with empty String
            startDate = "";  
            completionDate = "";
            examDate = "";
            isRegistered = false; // isRegistered is assigned false boolean value
            isRemoved = true; // isRemoved is assigned true boolean value
        }
    }
    
    /**
     * This method displays instructor,startDate,completionDate,examDate if NonAcademicCourse is registered
     */
    public void display()
    {
        super.display(); // display method from super class is called
        // checks if the course is registered 
        if (isRegistered == true) {
            System.out.println(instructor + " is the instructor of the course.");
            System.out.println("The course will Start on " + startDate + " and will be completed on " + completionDate + ".");
            System.out.println("The exam will be conducted on " + examDate + ". \n");
        }
    }
}

 
public class Course
{
    // private instance variables are declared
    private String courseID,courseName,courseLeader;
    private int courseDuration;

    /** 
     * This is the constructor of Course class 
     * 
     * @param courseID,courseName,corseDuration
     */ 
    public Course(String courseID,String courseName,int courseDuration )
    {
        // arguments are assigned to instance variables courseID,courseName,courseDuration
        this.courseID = courseID; 
        this.courseName = courseName; 
        this.courseDuration = courseDuration; 
        courseLeader = ""; // courseLeader is initialized whith empty string
    }

    /** 
     * This is accessor method for private String courseID 
     * 
     * @return courseID
     */   
    public String getCourseID()
    {
        return courseID;
    }

    /** 
     * This is acessor method for private String courseName
     * 
     * @return courseName
     */
    public String getCourseName()
    {
        return courseName;
    }

    /** 
     * This is acessor method for private String courseLeader 
     * 
     * @return courseLeader
     */
    public String getCourseLeader()
    {
        return courseLeader;
    }

    /**
     * This is acessor method for private int courseDuration
     * 
     * @return courseDuration
     */
    public int getCourseDuration()
    {
        return courseDuration;
    }

    /**
     * This is mutator method for private String courseLeader
     * 
     * @param courseLeader
     */
    public void setCourseLeader(String courseLeader)
    {
        // argument is assigned to instance variable courseLeader
        this.courseLeader = courseLeader; 
    }

    /**
     * This method displays courseID,courseName,courseDuration,courseLeader
     */
    public void display()
    {
        System.out.println("The course ID number is " + courseID + " and the course name is " + courseName + ".");
        System.out.println("This course lasts for " + courseDuration + " months.");
        if (courseLeader != "") {
            // courseLeader is displayed if it is not empty String
            System.out.println(courseLeader + " is the leader of the course.");
        }
    }
}

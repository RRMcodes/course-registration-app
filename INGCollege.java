// Java packages are imported 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

/** This class inherits attributes and methods from ActionListener interface */
public class INGCollege implements ActionListener
{
    // GUI components such as JFrame, JPanel, JTextField, JTextArea and JButtons are declared
    static JFrame frame;
    static JPanel panel1, panel2;
    static JLabel title, page, label1, label2 , label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13;
    static JTextField courseID1, courseID2, courseName1,courseName2, courseDuration1, courseDuration2, courseLeader1, courseLeader2, lecturer, level, credit, startDate1, startDate2,  completionDate1, completionDate2, assessmentCount, instructor, examDate;
    static JTextArea prerequisite;
    static JButton clearbtn1, clearbtn2, displaybtn1, displaybtn2, registerbtn1, registerbtn2, addbtn1, addbtn2, removebtn, nextbtn, previousbtn;
    
    // Array List is declared which stores object of course class
    static ArrayList<Course> course = new ArrayList<>(); 
    
    /** 
     * This is the main method of INGCollege class 
     * 
     * @param String [ ] args
     */
    public static void main(String [] args)
    {
        // GUI JFrame is created 
        frame = new JFrame("Course Registration");
        
        // first JPanel is created  
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 1000, 700);// JPanel is positioned and sized
        
        // second JPanel is created  
        panel2 = new JPanel();
        panel2.setBounds(0, 0, 1000, 700);// JPanel is positioned and sized
        
        /** following are the components of first JPanel */
        
        // JLabel for title is created  
        title = new JLabel("Academic Course");
        title.setBounds(400, 30, 500, 40); // JLabel is positioned and sized
        title.setFont(new Font("arial", Font.BOLD, 30)); // Font, style and size of the JLabel are defined 
        panel1.add(title); // JLabel is added to first JPanel
        
        // JLabel for courseID is created  
        label1 = new JLabel("CourseID: ");
        label1.setBounds(80, 120, 95, 25); // JLabel is positioned and sized
        panel1.add(label1); // JLabel is added to first JPanel
       
        // JTextField for courseID id created 
        courseID1 = new JTextField();
        courseID1.setBounds(150, 120, 150, 30 ); // JTextField is positioned and sized
        panel1.add(courseID1); // JLabel is added to first JPanel
        
        // JLabel for course name is created 
        label2 = new JLabel("Course Name: ");
        label2.setBounds(50, 170, 95, 25); // JLabel is positioned and sized
        panel1.add(label2); // JLabel is added to first JPanel
        
        // JTextField for course name is created 
        courseName1 = new JTextField();
        courseName1.setBounds(150, 170, 200, 30 ); // JTextField is positioned and sized
        panel1.add(courseName1); // JTextField is added to first JPanel
        
        // JLabel for course duration is created 
        label3 = new JLabel("Duration: ");
        label3.setBounds(430, 170, 95, 25); // JLabel is positioned and sized
        panel1.add(label3); // JLabel is added to first JPanel
        
        // JTextField for course duration is created  
        courseDuration1 = new JTextField();
        courseDuration1.setBounds(500, 170, 100, 30 ); // JTextField is positioned and sized
        panel1.add(courseDuration1); // JTextField is added to first JPanel
        
        // JLabel for lecturer name is created 
        label4 = new JLabel("Lecturer name: ");
        label4.setBounds(420, 320, 95, 25); // JLabel is positioned and sized
        panel1.add(label4); // JLabel is added to first JPanel
        
        // JTextField for lecturer name is created 
        lecturer = new JTextField();
        lecturer.setBounds(525, 320, 200, 30); // JTextField is positioned and sized
        panel1.add(lecturer); // JTextField is added to first JPanel
        
        //JLabel for level is created 
        label5 = new JLabel("Level: ");
        label5.setBounds(665, 170, 95, 25); // JLabel is positioned and sized
        panel1.add(label5); // JLabel is added to first JPanel
        
        // JTextField for level is created 
        level = new JTextField();
        level.setBounds(720, 170, 200, 30); // JTextField is positioned and sized
        panel1.add(level); // JTextField is added to first JPanel
                
        // JLabel for credit is created 
        label6 = new JLabel("Credit: ");
        label6.setBounds(85, 220, 95, 25); // JLabel is positioned and sized
        panel1.add(label6); // JLabel is added to first JPanel
        
        // JTextField for credit is created 
        credit = new JTextField();
        credit.setBounds(150, 220, 150, 30); // JTextField is positioned and sized
        panel1.add(credit); // JTextField is added to first JPanel
        
        // JLabel for completion date id created  
        label7 = new JLabel("Completion Date: ");
        label7.setBounds(415, 370, 120, 25); // JLabel is positioned and sized
        panel1.add(label7); // JLabel is added to first JPanel
        
        // JTextField for completion date is created 
        completionDate1 = new JTextField();
        completionDate1.setBounds(525, 370, 150, 30); // JTextField is positioned and sized
        panel1.add(completionDate1); // JTextField is added to first JPanel
        
        // JLabel for start date is created 
        label8 = new JLabel("Start Date: ");
        label8.setBounds(50, 370, 95, 25); // JLabel is positioned and sized
        panel1.add(label8); // JLabel is added to first JPanel
        
        // JTextField for start date is created 
        startDate1 = new JTextField();
        startDate1.setBounds(150, 370, 150, 30); // JTextField is positioned and sized
        panel1.add(startDate1); // JTextField is added to first JPanel
        
        // JLabel for number of assessment is created 
        label9 = new JLabel("Number of assessments: ");
        label9.setBounds(350, 220, 150, 25); // JLabel is positioned and sized
        panel1.add(label9); // JLabel is added to first JPanel
        
        // JTextField for number of assessment is created 
        assessmentCount = new JTextField();
        assessmentCount.setBounds(500, 220, 100, 30 ); // JTextField is positioned and sized
        panel1.add(assessmentCount); // JTextField is added to first JPanel
                  
        // JLabel for course leader is created 
        label13 = new JLabel("courseLeader: ");
        label13.setBounds(50, 320, 95, 25); // JLabel is positioned and sized
        panel1.add(label13); // JLabel is added to first JPanel
        
        // JTextField for courseLeader is created 
        courseLeader1 = new JTextField();
        courseLeader1.setBounds(150, 320, 200, 30); // JTextField is positioned and sized
        panel1.add(courseLeader1); // JTextField is added to first JPanel
        
        // JLable for page number is created 
        page = new JLabel("1 of 2");
        page.setBounds(240, 480, 95, 30); // JLabel is positioned and sized
        panel1.add(page); // JLabel is added to first JPanel
        
        // JButton for clear button is created 
        clearbtn1 = new JButton("Clear");
        clearbtn1.setBounds(660, 460, 95, 50); // JButton is  positioned and sized
        panel1.add(clearbtn1); // JButton is added to first JPanel
        
        // JButton for display button is created 
        displaybtn1 = new JButton("Display");
        displaybtn1.setBounds(770, 460, 150, 50);// JButton is  positioned and sized
        panel1.add(displaybtn1); // JButton is added to first JPanel
        
        // JButton for "add course" button is created 
        addbtn1 = new JButton("Add Course");
        addbtn1.setBounds(800, 220, 120, 50);// JButton is  positioned and sized
        panel1.add(addbtn1); // JButton is added to first JPanel
        
        // JButton for register button is created 
        registerbtn1 = new JButton("Register");
        registerbtn1.setBounds(800, 350, 120, 50); // JButton is  positioned and sized
        panel1.add(registerbtn1); // JButton is added to first JPanel
        
        // JButton for  "next page" button is created 
        nextbtn = new JButton("next page");
        nextbtn.setBounds(300, 460, 100, 50); // JButton is  positioned and sized
        panel1.add(nextbtn); // JButton is added to first JPanel
        
        /** following are the components of second JPanel */
        
        // JLabel for title is created  
        title = new JLabel("Non-Academic Course");
        title.setBounds(350, 30, 500, 40); // JLabel is positioned and sized
        title.setFont(new Font("arial", Font.BOLD, 30)); // Font, style and size of the JLabel are defined 
        panel2.add(title); // JLabel is added to second JPanel
        
        // JLabel for courseID is created 
        label1 = new JLabel("CourseID: ");
        label1.setBounds(80, 120, 95, 25); // JLabel is positioned and sized
        panel2.add(label1); // JLabel is added to second JPanel
        
        // JTextField for courseID is created 
        courseID2 = new JTextField();
        courseID2.setBounds(150, 120, 150, 30 ); // JTextField is positioned and sized
        panel2.add(courseID2); // JTextField is added to second JPanel
        
        // JLabel for course name is created 
        label2 = new JLabel("Course Name: ");
        label2.setBounds(50, 170, 95, 25); // JLabel is positioned and sized
        panel2.add(label2); // JLabel is added to second JPanel
        
        // JTextField for course name is created 
        courseName2 = new JTextField();
        courseName2.setBounds(150, 170, 200, 30 ); // JTextField is positioned and sized
        panel2.add(courseName2); // JTextField is added to second JPanel
        
        // JLabel for course duration is created 
        label3 = new JLabel("Duration: ");
        label3.setBounds(420, 170, 95, 25); // JLabel is positioned and sized
        panel2.add(label3); // JLabel is added to second JPanel
        
        // JTextField for course duration is created 
        courseDuration2 = new JTextField();
        courseDuration2.setBounds(490, 170, 100, 30 ); // JTextField is positioned and sized
        panel2.add(courseDuration2); // JTextField is added to second JPanel
        
        // JLabel for completion date is created 
        label7 = new JLabel("Completion Date: ");
        label7.setBounds(415, 350, 120, 25); // JLabel is positioned and sized
        panel2.add(label7); // JLabel is added to second JPanel
        
        // JTextField for completion date is created 
        completionDate2 = new JTextField();
        completionDate2.setBounds(525, 350, 150, 30); // JTextField is positioned and sized
        panel2.add(completionDate2); // JTextField is added to second JPanel
        
        // JLabel for start date is created 
        label8 = new JLabel("Start Date: ");
        label8.setBounds(50, 350, 95, 25); // JLabel is positioned and sized
        panel2.add(label8); // JLabel is added to second JPanel
        
        // JTextField for start date is created 
        startDate2 = new JTextField();
        startDate2.setBounds(150, 350, 150, 30); // JTextField is positioned and sized
        panel2.add(startDate2); // JTextField is added to second JPanel
        
        // JLabel for instructor name is created 
        label10 = new JLabel("Instructor name: ");
        label10.setBounds(410, 300, 150, 25); // JLabel is positioned and sized
        panel2.add(label10); // JLabel is added to second JPanel
        
        // JTextField for instructor name id created 
        instructor = new JTextField();
        instructor.setBounds(525, 300, 200, 30 ); // JTextField is positioned and sized
        panel2.add(instructor); // JTextField is added to second JPanel
        
        // JLabel for exam date is created 
        label11 = new JLabel("Exam Date: ");
        label11.setBounds(50, 400, 95, 25); // JLabel is positioned and sized
        panel2.add(label11); // JLabel is added to second JPanel
        
        // JTextField for exam date is created 
        examDate = new JTextField();
        examDate.setBounds(150, 400, 150, 30 ); // JTextField is positioned and sized
        panel2.add(examDate); // JTextField is added to second JPanel
        
        // JLabel for prerequisite is created 
        label12 = new JLabel("prerequisite: ");
        label12.setBounds(565, 120, 95, 25); // JLabel is positioned and sized
        panel2.add(label12); // JLabel is added to second JPanel
        
        // JTextArea for prerequisite is created 
        prerequisite = new JTextArea();
        prerequisite.setBounds(650, 120, 275, 80); // JTextArea is positioned and sized
        panel2.add(prerequisite); // JTextArea is added to second JPanel
        
        // JLabel for course leader is created 
        label13 = new JLabel("Course Leader: ");
        label13.setBounds(50, 300, 95, 25); // JLabel is positioned and sized
        panel2.add(label13); // JLabel is added to second JPanel
        
        // JTextField for course leader is created 
        courseLeader2 = new JTextField();
        courseLeader2.setBounds(150, 300, 200, 30); // JTextField is positioned and sized
        panel2.add(courseLeader2); // JTextField is added to second JPanel
        
        // JLabel for page number is created 
        page = new JLabel("2 of 2");
        page.setBounds(240, 480, 95, 30); // JLabel is positioned and sized
        panel2.add(page); // JLabel is added to second JPanel
        
        // JButton for clear button is created 
        clearbtn2 = new JButton("Clear");
        clearbtn2.setBounds(660, 460, 95, 50); // JButton is positioned and sized
        panel2.add(clearbtn2); // JButton is added to second JPanel
        
        // JButton for display button is created 
        displaybtn2 = new JButton("Display");
        displaybtn2.setBounds(770, 460, 150, 50); // JButton is positioned and sized
        panel2.add(displaybtn2); // JButton is added to second JPanel
        
        // JButton for "add course: button is created 
        addbtn2 = new JButton("Add Course");
        addbtn2.setBounds(800, 220, 120, 50); // JButton is positioned and sized
        panel2.add(addbtn2); // JButton is added to second JPanel
        
        // JButton for register button is created 
        registerbtn2 = new JButton("Register");
        registerbtn2.setBounds(800, 325, 120, 50); // JButton is positioned and sized
        panel2.add(registerbtn2); // JButton is added to second JPanel
        
        // JButton for remove button is created 
        removebtn = new JButton("Remove");
        removebtn.setBounds(800, 385, 120, 50); // JButton is positioned and sized
        panel2.add(removebtn); // JButton is added to second JPanel
                
        // JButton for "previous page " button is created 
        previousbtn = new JButton("previous page");
        previousbtn.setBounds(90, 460, 120, 50); // JButton is positioned and sized
        panel2.add(previousbtn); // JButton is added to second JPanel
        
        // Absolute positioning of first JPanel components are enabled
        panel1.setLayout(null);
        frame.add(panel1); // first JPanel is added to JFrame
        
        // Absolute positioning of second JPanel components are enabled
        panel2.setLayout(null);
        frame.add(panel2); // second JPanel is added to JFrame
        
        // Action Listener are added to following JButtons and current instance are passed as parameters
        clearbtn1.addActionListener(new INGCollege());
        displaybtn1.addActionListener(new INGCollege());
        clearbtn2.addActionListener(new INGCollege());
        displaybtn2.addActionListener(new INGCollege());
        nextbtn.addActionListener(new INGCollege());
        previousbtn.addActionListener(new INGCollege());
        addbtn1.addActionListener(new INGCollege());
        addbtn2.addActionListener(new INGCollege());
        registerbtn1.addActionListener(new INGCollege());
        registerbtn2.addActionListener(new INGCollege());
        removebtn.addActionListener(new INGCollege());
        
        
        panel1.setVisible(true); // first JPanel is initially set to visible
        panel2.setVisible(false); // second JPanel is initially set to invisible
        
        // JFrame is positioned and sized 
        frame.setBounds(100, 100, 1000 ,600);
        frame.setLayout(null); // Absolute positioning of JFrame is enabled
        frame.setVisible(true); // JFrame is set to visible
        frame.setResizable(false); // JFrame is set to unresizable
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // JFrame is set to exit when clicked on close button
        
    }
    
    /**
     * This method is used to implement the Action Listeners to handle events
     *   
     * @param ActionEvent
     */
    public void actionPerformed(ActionEvent e)
    {
        // if addbtn 1 is clicked 
        if (e.getSource() == addbtn1) { 
            // if number format exception occurs it is handled by catch block
            try {
                // value from JTextFields are assigned to local variables 
                String CourseID = courseID1.getText();
                String CourseName = courseName1.getText();
                int CourseDuration = Integer.parseInt(courseDuration1.getText());
                String Level = level.getText();
                int Credit = Integer.parseInt(credit.getText());
                int AssessmentCount = Integer.parseInt(assessmentCount.getText());
                boolean courseAdded = false;
                // iterating througt the array list
                for (Course c: course){ 
                    // if c is an object of Academic course and courseID form arraylist and JTextField match 
                    if (c instanceof AcademicCourse && c.getCourseID().equals(CourseID)  ){
                        courseAdded = true;
                        break;
                    }
                    else{
                        if (c instanceof AcademicCourse)  {
                            courseAdded = false;
                        }
                    }
                }
                if (courseAdded == false) {
                    // new object of academic course class is created
                    AcademicCourse academicCourse = new AcademicCourse(CourseID, CourseName, CourseDuration, Level, Credit, AssessmentCount);
                    course.add(academicCourse); // object is added to arraylist
                    JOptionPane.showMessageDialog(panel1, "The course is added successfully");
                }
                else {
                    JOptionPane.showMessageDialog(panel1,"An academic course with this courseID is already added","Warning",JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(panel1, "Invalid input to add a course ! \n enter data correctly","Error",JOptionPane.ERROR_MESSAGE); 
            }
        }
        
        // if addbtn2 is clicked
        else if (e.getSource() == addbtn2) { 
            // if number format exception occurs it is handled by catch block
            try{
                // value from JTextFields are assigned to local variables 
                String CourseID = courseID2.getText();
                String CourseName = courseName2.getText();
                int CourseDuration = Integer.parseInt(courseDuration2.getText());
                String Prerequisite = prerequisite.getText();
                boolean courseAdded = false;
                // iterating through the array list
                for (Course c: course){
                    // if c is an object of Non-Academic course and courseID form arraylist and JTextField match 
                    if (c.getCourseID().equals(CourseID) && c instanceof NonAcademicCourse ) { 
                        courseAdded = true; 
                        break;
                    }
                    else {
                        if (c instanceof NonAcademicCourse ) {
                            courseAdded = false;    
                        }
                    }
                }
                if ( courseAdded == false) {
                    // new object of NonAcademic course class is created
                    NonAcademicCourse nonAcademicCourse = new NonAcademicCourse(CourseID, CourseName, CourseDuration, Prerequisite);
                    course.add(nonAcademicCourse); // object is added to arraylist
                    JOptionPane.showMessageDialog(panel2, "The  course is added successfully");
                }
                 else {
                    JOptionPane.showMessageDialog(panel2,"A non-academic course with this courseID is already added","Warning",JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(panel2, "Invalid input to add a course ! \n enter data correctly","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //if registerbtn1 is clicked
        else if (e.getSource() == registerbtn1) {
            boolean courseAdded = false;
            // iterating through the array list
            for (Course c: course){
                // if c is an object of Academic course and courseID form arraylist and JTextField match 
                if (c instanceof AcademicCourse && c.getCourseID().equals(courseID1.getText())) {
                    courseAdded = true;
                    AcademicCourse ac  = (AcademicCourse)c;// object in arraylist is casted into object of academic course class 
                    // if academic course is not registered
                    if (ac.getIsRegistered() == false){
                        // value from JTextFields are assigned to local variables 
                        String CourseLeader = courseLeader1.getText();
                        String StartDate = startDate1.getText();
                        String Lecturer = lecturer.getText();
                        String CompletionDate = completionDate1.getText();
                        ac.register(CourseLeader, Lecturer, StartDate, CompletionDate); // register method from academic course class is called
                        JOptionPane.showMessageDialog(panel1, "The academic course has been registered ");
                        break;
                    }
                    else {
                        JOptionPane.showMessageDialog(panel1, "An academic course with this courseID is already registered","Warning",JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                }
                else {
                    courseAdded = false;
                }
            }
            if (courseAdded == false) {
                JOptionPane.showMessageDialog(panel1, " Cannot register ! \n The course should be added first","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // if registerbtn2 is clicked
        else if (e.getSource() == registerbtn2) {
            boolean courseAdded = false;
            // iterating through the array list
            for (Course c: course) {
                // if c is an object of Non-Academic course and courseID form arraylist and JTextField match 
                if (c.getCourseID().equals(courseID2.getText()) && c instanceof NonAcademicCourse) {
                    courseAdded = true;
                    NonAcademicCourse nac = (NonAcademicCourse)c; // object in arraylist is casted into object of non-academic course class 
                    // if non-academic course is not registered
                    if (nac.getIsRegistered() == false){
                        // value from JTextFields are assigned to local variables 
                        String CourseLeader = courseLeader2.getText(); 
                        String Instructor = instructor.getText();
                        String StartDate = startDate2.getText();
                        String CompletionDate = completionDate2.getText();
                        String ExamDate = examDate.getText();
                        nac.register(CourseLeader, Instructor, StartDate, CompletionDate, ExamDate); // register method from non-academic course class is called
                        JOptionPane.showMessageDialog(panel2, "The non-academic course has been registered");
                        break;
                    }
                    else {
                        JOptionPane.showMessageDialog(panel2, "A non-academic with this courseID is already registered ","Warning",JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                }
                else {
                    courseAdded = false;
                }
            }
            if (courseAdded == false) {
                JOptionPane.showMessageDialog(panel2, " Cannot register !  \n The course should be added first","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // if clearbtn2 or clear btn2 is clicked
        else if (e.getSource() == clearbtn1 || e.getSource() == clearbtn2 ) {
            // all the JTextField values are cleared
            courseID1.setText("");
            courseName1.setText("");
            courseDuration1.setText("");
            lecturer.setText("");
            level.setText("");
            credit.setText("");
            startDate1.setText("");
            completionDate1.setText("");
            assessmentCount.setText("");
            courseID2.setText("");
            courseName2.setText("");
            courseDuration2.setText("");
            instructor.setText("");
            startDate2.setText("");
            completionDate2.setText("");
            examDate.setText("");
            prerequisite.setText("");
            courseLeader1.setText("");
            courseLeader2.setText("");
        }
        
        // if displaybtn1 is clicked 
        else if(e.getSource() == displaybtn1 ){
            boolean courseAdded = false;
            // iterating through the array list
            for(Course c : course){
                if (c instanceof AcademicCourse ) {
                    AcademicCourse ac = (AcademicCourse)c; // object in arraylist is casted into object of academic course class 
                    ac.display(); // display method from academic course class is called
                    courseAdded = true;
                }
            }
            if (courseAdded == false) {
                JOptionPane.showMessageDialog(panel1, "cannot display ! \n course should be added first","warning",JOptionPane.WARNING_MESSAGE);
            }
            else{
                 JOptionPane.showMessageDialog(panel1, "The details of Academic course is displayed in the terminal");
            }
        }
        
        // if displaybtn2 is clicked
        else if(e.getSource() == displaybtn2){
            boolean courseAdded = false;
            // iterating through the array list
            for(Course c : course){
                if (c instanceof NonAcademicCourse ){
                    NonAcademicCourse nac = (NonAcademicCourse)c; // object in arraylist is casted into object of non-academic course class 
                    nac.display(); // display method from non-academic course class is called
                    courseAdded = true;
                }
            }
            if (courseAdded == false) {
                JOptionPane.showMessageDialog(panel2, "cannot display ! \n course should be added first","warning",JOptionPane.WARNING_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(panel2, "The details of non-academic course is displayed in the terminal");
            }
        }
        
        // if remove btn is clicked
        else if (e.getSource() == removebtn){
            boolean exists = false;
            // iterating through the array list
            for(Course c : course){
                // if object is instance of non-academic course
                 if (c instanceof NonAcademicCourse  ){
                    NonAcademicCourse nac = (NonAcademicCourse)c; // object in arraylist is casted into object of non-academic course class 
                    // if courseID from arraylist matches with courseID from JTextField
                    if (c.getCourseID().equals(courseID2.getText())) {
                        exists = true;
                        // if non-academic course is not removed
                        if (nac.getIsRemoved() == false ){
                            nac.remove(); // remove method from non-academic course class is called
                            course.remove(nac); // the course is removed from arraylist
                            JOptionPane.showMessageDialog(panel2, "The course is successfully removed");
                            break;
                        }
                        else {
                            JOptionPane.showMessageDialog(panel2, "The course with this courseID has already been removed","Message",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    exists = false;
                }
            }   
            if (exists == false) {
                JOptionPane.showMessageDialog(panel2, "The course does not exist","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // if nextbtn is clicked
        else if (e.getSource() == nextbtn) { 
            // non-academic course panel is visible
            panel1.setVisible(false);
            panel2.setVisible(true);
        }
        
        // if previousbtn is clicked
        else if (e.getSource() == previousbtn) {
            // academic cource panel is visible
            panel1.setVisible(true);
            panel2.setVisible(false);
        }
    }
} 

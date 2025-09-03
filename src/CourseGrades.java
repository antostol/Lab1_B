/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2484936
 */
public class CourseGrades implements Analyzable {
    private GradedActivity grades[];
    private final static int NUM_GRADES = 4;

    public CourseGrades() {
        grades = new GradedActivity[NUM_GRADES];
    }
    
    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }
    
    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }
    
    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }
    
    public void setFinalExam (FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }

    @Override
    public String toString() {
        return "Lab score: " + grades[0].getScore() +  "   Grade: " + grades[0].getGrade() + "/n"
                + "Pass/Fail Exam Score: " + grades[1].getScore() + "   Grade:" + grades[1].getGrade() + "/n"
                + "Essay Score: " + grades[2].getScore() + "   Grade" + grades[2].getGrade() + "/n"
                + "Final Exam Score: " + grades[3].getScore() + " Grade: " + grades[3].getGrade()
                + "Average Score: " + getAverage() + "/n"
                + "Highest Score: " + getHighest() + "/n"
                + "Lowest Score: " + getLowest();
    }

    @Override
    public double getAverage() {
        return (grades[0].getScore() + grades[1].getScore() + grades[2].getScore() + grades[3].getScore())/4;
    }

    @Override
    public GradedActivity getHighest() {
       GradedActivity max = grades[0];
       
       for (int i = 1; i < 4; i++) {
           if (grades[i].getScore() > max.getScore()) {
               max = grades[i];
           }
       }
       
       return max;
    }

    @Override
    public GradedActivity getLowest() {
        GradedActivity min = grades[0];
       
       for (int i = 1; i < 4; i++) {
           if (grades[i].getScore() < min.getScore()) {
               min = grades[i];
           }
       }
       
       return min;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2484936
 */
public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;
    }
    
    public double getPointsEach() {
        pointsEach = 100.0 / numQuestions;
        double numericScore = 100.0 - (numMissed * pointsEach);
        setScore(numericScore);
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }

    @Override
    public String toString() {
        return "Each question counts for " + pointsEach + " points./n"
                + "The exam score is " + this.getScore() + "/n"
                + "The exam grade is " + this.getGrade();
    }
    
    
}

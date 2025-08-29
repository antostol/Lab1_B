/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2484936
 */
public class PassFailActivity extends GradedActivity {
    private double minPassingScore;

    public PassFailActivity(double mps) {
        this.minPassingScore = mps;
    }
    
    @Override
    public char getGrade() {
        if (this.getScore() >= minPassingScore) return 'P';
        return 'F';
    }

    @Override
    public String toString() {
        return "What is the minimum passing score? " + this.minPassingScore + "\n"
                + "The exam score is " this.getScore() + 
                + "The exam grade is " + getGrade();
    }
    
    
}

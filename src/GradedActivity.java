/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2484936
 */
public class GradedActivity {
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    public char getGrade() {
        if (score >= 90) {
            return 'A';
        }
        if (score >= 80) {
            return 'B';
        }
        if (score >= 70) {
            return 'C';
        }
        if (score >= 60) {
            return 'D';
        } else {
            return 'E';
        }
    }
    
}

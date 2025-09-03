/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2484936
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public PassFailExam(int questions, int missed, double minPassing) {
        super(minPassing);
        this.numQuestions = questions;
        this.numMissed = missed;
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }

    @Override
    public String toString() {
        return "Each question counts " + this.getPointsEach() + " points.\n"
                + "The exam score is " + this.getScore() + "\n"
                + "The exam grade is " + this.getGrade();
    }
}

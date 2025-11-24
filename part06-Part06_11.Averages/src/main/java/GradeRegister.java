
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    public ArrayList<Integer> pointsList;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.pointsList = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        pointsList.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades(){
        double sum = 0.0;
        int cnt =0;
        for (int k: this.grades){
            cnt++;
            sum+=k;
        }
        if (cnt > 0){
            return sum/cnt;
        }
        return -1;
    }

    public double averageOfPoints(){
        int sum = 0;
        for (int k: this.pointsList){
            sum+=k;
        }
        if (pointsList.size() > 0){
            return 1.0 * sum/pointsList.size();
        }
        return  -1;
    }
}

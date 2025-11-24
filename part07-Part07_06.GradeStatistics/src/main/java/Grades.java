import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;
    private int passingStudents;
    public ArrayList<Integer> pointsList;
    
    public Grades(){
        this.grades = new ArrayList<Integer>();
        this.pointsList = new ArrayList<Integer>();
    }

    public void add(int num){
        if (num >=0 && num <=100){
            // System.out.println(num);
            this.grades.add(num);
            this.pointsList.add(pointsToGrade(num));
        }
    }

    public int sum(){
        int tot = 0;
        for (int k:this.grades){
            // System.out.println("Each k value"+k);
            tot+=k;
        }
        // System.out.println("total sum "+ tot);
        return tot;
    }

    public double average(){
        return 1.0*this.sum()/this.grades.size();
    }

    public double passAverage(){
        int tot = 0;
        this.passingStudents = 0;
        for (int k:this.grades){
            if (k >=50){
                tot+=k;
                this.passingStudents++;
            }
        }
        return 1.0 * tot/ this.passingStudents;
    }

    public double PassPercentage(){
        return 100.0 * this.passingStudents / this.grades.size();
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


    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = this.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.pointsList) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
}

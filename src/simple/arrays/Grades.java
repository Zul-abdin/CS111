package simple.arrays;

public class Grades {

    public  static void add(double[][] scores, int student, int exam, double grade){
        //check array bounds
        if(scores.length > student && scores[student].length > exam) {
            scores[student][exam] = grade;
        } else {
            System.out.println("Index out of bounds");
        }

    }

    public static void printGradesForStudent(double[][] scores, int student){

        if(scores.length < student){
            System.out.println("Out of Bounds");
            return;
        }
        System.out.print("Grades for Student " + student + ": ");

            /*
             *   for(int c = 0; c < scores[student].length; c++){
             *       System.out.print(scores[student][c] + " ");
             *   }
             */

            //for-each loop to do the same thing
        for(double grade: scores[student]){
                System.out.print(grade + " ");
        }

        System.out.println();

    }

    public static double studentAverage(double[][] scores, int student){

        double total = 0;
        if(scores.length < student){
            System.out.println("Out of bounds: " + student);
            return -1;
        } else {
            for(int i = 0; i < scores[student].length; i++){
                total += scores[student][i];
            }
        }
        double result = total / scores[student].length;

        return result;

    }

    public static double examAverage(double[][] scores, int exam){
        double total = 0;
        for(int i = 0; i < scores.length; i++){
            if(scores[i].length > exam) {
                total += scores[i][exam];
            } else {
                System.out.println("Index out of bounds");
            }
        }
        double result = total/scores.length;
        return result;
    }

    public static void main(String[] args) {

        //2D array for 4 students, 3 exams
        //[row][column]
        //one row per student
        double[][] grades = new double[2][3];
        add (grades, 0, 6, 6.3); // will go out of the bounds of the array
        add (grades, 0, 0, 6.3);
        add (grades, 0, 1, 8.2);
        add (grades, 0, 2, 4.1);
        add (grades, 1, 0, 6.2);
        add (grades, 1, 1, 9.3);
        add (grades, 1, 2, 3.2);
        printGradesForStudent(grades, 0);

        for(int i = 0; i < grades.length; i++){
            System.out.println("Average for Student " + i + ": " + studentAverage(grades, i));
        }
        System.out.println("Average for Exam 1: " + examAverage(grades, 1));

    }

}

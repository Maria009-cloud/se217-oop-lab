public class GradeEvaluation {

    public static void main(String[] args) {
        int marks = 74;
        System.out.println("Marks: " + marks + " | Grade: " + getGrade(marks));
    }


    public static String getGrade(int marks) {
        if (marks >= 80) {
            return "A+";
        } else if (marks >= 70) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }
}
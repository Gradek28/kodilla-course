public class GradesNext {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(5);
        grades.add(2);
        System.out.println(grades.lastGrade());
        System.out.println(grades.averageGrades());
    }
}

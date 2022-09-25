public class Main {
    public static void main(String[] args) {

        student_profile student_profile1 = new student_profile(
                "abhishek",
                "n",
                "mca",
                2022,
                8.5);
        student_profile1.incrementExpectedGraduationYear();
        System.out.println(student_profile1.expectedGraduationYear);
    }
}
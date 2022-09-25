public class student_profile {
    String firstName;
    String lastName;
    String majorDegree;
    int expectedGraduationYear;
    double gpa;

    public student_profile(String firstName,
                           String lastName,
                           String majorDegree,
                           int expectedGraduationYear,
                           double gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.majorDegree = majorDegree;
        this.expectedGraduationYear = expectedGraduationYear;
        this.gpa = gpa;

    }

    public void incrementExpectedGraduationYear(){
        this.expectedGraduationYear = this.expectedGraduationYear+1;
    }
}

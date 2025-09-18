class Student {
    String studentID;
    String studentName;
    double[] scores;  
    String[] skills;
    final static int NO_OF_SUBJECTS = 5;
    final static int MAX_NO_SKILLS = 10;
    public Student(String id, String name)
    {
        studentID = id;         //this.studentId = id;
        studentName = name;
        scores = new double[NO_OF_SUBJECTS];
        skills = new String[MAX_NO_SKILLS];
    }
    public Student(String id, String name,double[] scores)
    {
        studentID = id;         //this.studentId = id;
        studentName = name;
        for(int i=0;i<NO_OF_SUBJECTS;i++)
            this.scores[i] = scores[i];
    }
    //addSkill
    //removeSkill
    //isHavingSkill
}
public class StudentScoreAnalysis {    public static void main(String[] args) {
        // Main method to run the program
    }
}


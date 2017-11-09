// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike"); //create student2, "Mike"
        student1.inputGrades();//input grades for Mary
        System.out.println(student1);
        System.out.println("Average is " + student1.getAverage());//print average for Mary
        student2.inputGrades();//input grades for Mike
        System.out.println(student2);
        System.out.println("Average is " + student2.getAverage());//print average for Mike
    }
}


// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    String name;
    int score1, score2;
    //constructor
    Scanner scan = new Scanner(System.in);
     public Student(String studentName)
    {
        this.name = studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Enter " + this.name + "'s score for test 1");
        score1 = scan.nextInt();
        System.out.println("Enter " + this.name + "'s score for test 2");
        score2 = scan.nextInt();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    public double getAverage()
    {
        return (score1 + score2)/2;
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    //add header for getName
    public String getName()
    {
        return this.name;//add body of getName
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    //add header for printName
    public void printName()
    {
        System.out.println("Student name is " + this.name);//add body of printName
    }
    public String toString()
    {
        return "Name: " + this.name + "  Test1: " + score1 + "  Test2: " + score2;
    }
}

    
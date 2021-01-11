package Antras;
/*Write an application, which with the help of the scanner,
        takes user's input and creates an object based on the input. Use loops to enter multiple objects.
        Finally put the objects into array. Eg. Enter student's name, age, grade.
        Create object, set the values to the object field,
        add object to array. Bonus: add the ability to edit or delete object from the array. */

import java.util.ArrayList;
import java.util.Scanner;

public class AntrasMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(createStudent());

        for (Student student : students) {
            System.out.println(student.getName()+" Age: "+student.getAge()+" Grade: "+student.getGrade());
        }

    }
    private static Student createStudent (){
           Scanner scanner = new Scanner(System.in);
           Student student = new Student();
           System.out.println("Student Name : ");
           student.setName(scanner.nextLine());
           System.out.println("Student Age : ");
           student.setAge(scanner.nextInt());
           System.out.println("Student Grade : ");
           student.setGrade(scanner.nextInt());
           return student;
       }

}

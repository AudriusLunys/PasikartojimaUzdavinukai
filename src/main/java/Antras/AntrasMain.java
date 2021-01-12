package Antras;
/*Write an application, which with the help of the scanner,
        takes user's input and creates an object based on the input. Use loops to enter multiple objects.
        Finally put the objects into array. Eg. Enter student's name, age, grade.
        Create object, set the values to the object field,
        add object to array. Bonus: add the ability to edit or delete object from the array. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AntrasMain {
    public static void main(String[] args) {

       addStudentsToList();

    }

    private static Student createStudent() {
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

    private static List<Student> addStudentsToList() {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input ="yes";
        while (input.toLowerCase().equals("yes")) {
            students.add(createStudent());
            System.out.println("add student -yes/no");
            input = scanner.nextLine();
            if (input.toLowerCase().equals("no")) {
                break;
            }
        }
       return students;
    }
}

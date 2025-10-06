package ie.atu.week4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<Student>();

        System.out.println("Please Enter The Number Of Students: ");
        int totalStudents = sc.nextInt();
        sc.nextLine();

        while (count < totalStudents)
        {
            System.out.println("Please Enter Your Name: ");
            String name = sc.nextLine();

            System.out.println("Please Enter Your Email: ");
            String email = sc.nextLine();

            System.out.println("Please Enter Your Course: ");
            String course = sc.nextLine();

            Student student1 = new Student();
            student1.setName(name);
            student1.setEmail(email);
            student1.setCourse(course);

            studentList.add(student1);

            count++;
        }

        for(Student student : studentList)
        {
            System.out.println("Name: " + student.getName() + " Email: " + student.getEmail() + " Course: " + student.getCourse());
        }
    }
}

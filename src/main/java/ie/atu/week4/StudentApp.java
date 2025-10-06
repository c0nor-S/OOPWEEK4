package ie.atu.week4;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Please Enter The Number Of Students: ");
        count = sc.nextInt();

        while (count <=3)
        {
            System.out.println("Please Enter Your Name: ");
            String name = sc.nextLine();

            System.out.println("Please Enter Your Email: ");
            String email = sc.nextLine();

            System.out.println("Please Enter Your Course: ");
            String course = sc.nextLine();
        }
    }
}

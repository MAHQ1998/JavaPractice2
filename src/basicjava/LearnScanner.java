package basicjava;

import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first_Name");

        String first_name = input.nextLine();
        System.out.println("First Name :"+ first_name);

        System.out.println("Enter your  last name");
        String lastName = input.nextLine();
        System.out.println("First Name :"+ lastName);

        System.out.println("Full Name: "+first_name+" "+lastName);

        System.out.println("Enter Course Fee");
        double cFee= input.nextDouble();
        System.out.println("course fee is "+cFee);

        System.out.println("Enter Your Age");
        int age= input.nextInt();
        System.out.println("My age is "+age);


        input.close();



    }
}

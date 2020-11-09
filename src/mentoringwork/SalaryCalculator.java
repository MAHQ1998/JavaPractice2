package mentoringwork;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        String name;
        int hours;
        double hRate;
        double grossPay;

        System.out.println(" Follow the Instruction");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name");
        name = scanner.nextLine();
        System.out.println("Enter my total hour");
        hours = scanner.nextInt();
        System.out.println("Enter hRate");
        hRate = scanner.nextDouble();


        grossPay = hours * hRate;

        System.out.println("---Pay Checks");
        System.out.println("Employee name is: " + name);
        System.out.println("total hour is: " + hours);
        System.out.println("Hourly Rate: " + hRate);
        System.out.println("Gross Pay is: " + grossPay);

        System.out.println("Thank You");


    }


}




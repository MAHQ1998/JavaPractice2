package basicjava;

public class LearnCasting {
    public static void main(String[] args) {

        //convert double to int

        double price =40.55;
        int discountedPrice = (int) price;
        System.out.println(discountedPrice);

        //convert int to doubl

        int age = 24;
        double newAge = (double) age;
        System.out.println(newAge);
        //convert int to byte

        int number = 56;
        byte total = (byte) number;
        System.out.printf("int to byte "+total);

        String name = "Shadman";
        String stName = name;
        String ssn = "1234";
        int newSsn = Integer.parseInt(ssn);
        System.out.println(newSsn);

        int newSssn1= Integer.valueOf(ssn);

        int salary= 2500;
        String s= String.valueOf(salary);


        }
    }


package randompractice;


public class CovertStringtoInt {
    public static void main(String[] args) {

        String s = "102";
        System.out.println(Integer.parseInt(s));// convert string to Int

        int n = Integer.parseInt(s);// initialized value of s and do the math
        System.out.println(n+4);

        int M = Integer.parseInt("5");
        System.out.println("5"+4);// normal string
        System.out.println(M+4);// real value if we are looking for

        int x = 8;
        System.out.println(x+1);// straight work int + int
        System.out.println(Integer.toString(x)+1); // Revers int to integer get 81

        String y = "age: 47"; // if we have string  value that both Integer and String value
        y = y.replaceAll("\\D+","");// its call regular Expiration
        int z = Integer.parseInt(y);
        System.out.println(z+5);// converted string into int

    }
}

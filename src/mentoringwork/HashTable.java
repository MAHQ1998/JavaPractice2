package mentoringwork;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {
    //HashTable is slower
    //HasTable  is slower because it's thread safety or synchronized.
    // can take "null" key or value
    public static void main(String[] args) {
        Hashtable<Integer,String> employee = new Hashtable<>();

        employee.put(117,"Kelly");
        employee.put(109,"Michael");
        employee.put(105,"Miles");
        employee.put(125,"Besfort");
        employee.put(null,"Kevin"); // can't take null key or value

        System.out.println(employee);






    }
}

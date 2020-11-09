package mentoringwork;

import java.util.HashMap;

public class HashHashMap2 {

    public static void main(String[] args) {

        HashMap<String,Integer> cityOfJapan = new HashMap<>();

        cityOfJapan.put("Tokyo",3435);
        cityOfJapan.put("Osaka",9877);
        cityOfJapan.put("Kyoto",3435);

        HashMap<String,Integer> cityOfKorea = new HashMap<>();

        cityOfJapan.put("Seoul", 3636);
        cityOfJapan.put("Busan", 3653);
        cityOfJapan.put("Daegu", 5355);


        HashMap<String,HashMap<String,Integer>> Asia = new HashMap<>();

        Asia.put("Japan",cityOfJapan );
        Asia.put("Korea", cityOfKorea);

        System.out.println(Asia);

    }







    // hash map of hash map
    // 1st hashmap then ["String"] is the key value and under
    // 2nd [hashmap <string,integer>] total is the value
}

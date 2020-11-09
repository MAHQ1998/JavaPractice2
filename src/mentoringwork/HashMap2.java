package mentoringwork;

import java.util.HashMap;

public class HashMap2 {
    //Java class library offers over 4400 pre build classes from Oracle that we can use in our JAVA program.
//such as ArrayList, Hash maps, Stacks ect..
    //Like ArrayLists, Hash Maps have a capacity, or an amount of allocated memory.
    // difference between ArrayList/ Map
// ArrayList we can store 1 data, in Map we can store 2 Data(key and value)
//ArrayList we can call value based in Index Number and HashMap we can call the value based on Key/Value
//HashMap is faster because it;s not thread safety or synchronized.
    // key -value..first data is the key and 2nd data is the value..

    public static void main(String[] args) {

        // key, value

        HashMap<Integer,String> employeeInfo = new HashMap<>();

        employeeInfo.put(144,"Aaliyah");
        employeeInfo.put(145,"Manha");
        employeeInfo.put(146,"Tuhfa");
        employeeInfo.put(146,"Tuhfa");
        employeeInfo.put(null,"Kevin");

        System.out.println(employeeInfo);

        HashMap<String,Integer> companyLocation = new HashMap<>();

        companyLocation.put("Boston",87998);
        companyLocation.put("NYC",10019);


        System.out.println(companyLocation);

        System.out.println(companyLocation.get("Boston"));

        System.out.println(companyLocation.size());

        System.out.println(companyLocation.containsValue(8799));


    }



}

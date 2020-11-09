package mentoringwork;

public class SamsungPhone {
    // Main purpose of Singleton to reduce the object creation.

    // 3 rules for singleton
    //1. privet static object of the class(half way)
    private static SamsungPhone samsungPhone = null; // half way


    //2. privet constructor. // purpose of creating privet so out side's --
    // class can not call and can't create an object.
    private SamsungPhone() {

    }

    public static SamsungPhone getInstance() {
        if (samsungPhone == null) {
            samsungPhone = new SamsungPhone();
        }
        return samsungPhone;
    }
    //3. public static method which has a return type of class(object)--singleton method.

    public String choseMyPhone() {
        return "Samsung 20";

    }

    public String choseMyPhone2(){

        return "Note 20";
    }


}

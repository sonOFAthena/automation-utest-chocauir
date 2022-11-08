package util;

public class Birthday {

    public static String getMonth(String birthDay){
        return splitBirthDate(birthDay)[0];
    }

    public static String getDay(String birthDay){
        return splitBirthDate(birthDay)[1];
    }

    public static String getYear(String birthDay){
        return splitBirthDate(birthDay)[2];
    }

    private static String[] splitBirthDate(String birthDay){
        return birthDay.split("/", 3);
    }
}

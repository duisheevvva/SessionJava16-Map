package database;

public class GenerateId {
    public  static Long studentId = 0L;  // pole

    public static Long studentId (){
        return ++studentId;
    }



}

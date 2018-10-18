import java.util.ArrayList;
import java.util.List;

public class testDB {
    public static void main (String [] agrs) {

        System.out.println("Before hitting the DB");
        List<Animals> aList = AnimalDao.getAnimals();
        System.out.println("After hitting the DB");
        for (Animals a : aList) 
            System.out.println(a.toString());
    }
}
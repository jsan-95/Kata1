package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {
    
    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1999, 11, 15);
        Person jesus = new Person("Jesus", date);
        System.out.println(jesus.getName()+" tiene "+jesus.getAge());
    }
}

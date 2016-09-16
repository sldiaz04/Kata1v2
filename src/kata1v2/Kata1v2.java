package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1v2 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1990, 1, 4);
        
        Person person = new Person("Sergio", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}

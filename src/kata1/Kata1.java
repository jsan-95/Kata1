package kata1;

import java.util.Date;

public class Kata1 {
    
    public static void main(String[] args) {
        Person jesus = new Person("Jesus",new Date(01,01,10));
        System.out.println("Me llamo "+jesus.getName()+" y tengo "+jesus.getAge()+" años");        
    }
}

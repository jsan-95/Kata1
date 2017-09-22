package kata1;

import java.util.Calendar;


public class Person {

    
    private final String name;
    private final Calendar birthday;
    
    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        return (int) ((new Calendar().getTime() -
                       birthday.getTime())/31536000000L);
    }
    
    
}

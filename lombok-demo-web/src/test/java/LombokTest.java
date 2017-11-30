import ryoe.taeyeon.lombok.Person;

import java.util.Date;

/**
 * Created by lvhantai on 2017/11/29.
 */
public class LombokTest {

    public void beanTest(){

    }

    public static void main(String[] args) {
        Person person = new Person();
        //person.setName("lv");
        //person.setAge(1);
        //person.setBirthday(new Date());
        System.out.println(person.getAge());
    }
}

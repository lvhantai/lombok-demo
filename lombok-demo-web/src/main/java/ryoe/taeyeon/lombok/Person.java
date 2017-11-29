package ryoe.taeyeon.lombok;

import lombok.Data;

import java.util.Date;

/**
 * Created by lvhantai on 2017/11/29.
 */
@Data
public class Person {
    private String name;
    private int age;
    private Date birthday;
}

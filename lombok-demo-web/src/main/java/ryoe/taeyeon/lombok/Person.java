package ryoe.taeyeon.lombok;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * Created by lvhantai on 2017/11/29.
 */
/**
 * 生成toString()方法，默认情况下，它会按顺序（以逗号分隔）打印你的类名称以及每个字段。
 * 可以这样设置不包含哪些字段@ToString(exclude = "id") / @ToString(exclude = {"id","name"})
 * 如果继承的有父类的话，可以设置callSuper 让其调用父类的toString()方法，例如：@ToString(callSuper = true)
 */
@ToString(exclude = {"birthday"}, callSuper = false)
/**
 * 生成hashCode()和equals()方法，默认情况下，它将使用所有非静态，非transient字段。
 * 但可以通过在可选的exclude参数中来排除更多字段。
 */
@EqualsAndHashCode(exclude = {"age", "birthday"})
/**
 * @NoArgsConstructor生成一个无参构造方法。
 * 当类中有final字段没有被初始化时，编译器会报错，此时可用@NoArgsConstructor(force = true)，
 * 然后就会为没有初始化的final字段设置默认值 0 / false / null。
 */
@NoArgsConstructor(force = true)
/**
 * @Data 包含了@ToString，@EqualsAndHashCode，@Getter / @Setter和@RequiredArgsConstructor的功能
 */
@Data
/**
 * @Accessors 主要用于控制生成的getter和setter.
 * 主要参数介绍 fluent boolean值，默认为false。此字段主要为控制生成的getter和setter方法前面是否带get/set
 * chain boolean值，默认false。如果设置为true，setter返回的是此对象，方便链式调用方法
 * prefix 设置前缀 例如：@Accessors(prefix = "abc") private String abcAge 当生成get/set方法时，会把此前缀去掉
 */
@Accessors(fluent = false, chain = false)
@Value
public class Person {
    /**
     * 可以用@Getter / @Setter注释任何字段，让lombok自动生成默认的getter / setter方法。
     * 默认生成的方法是public的，如果要修改方法修饰符可以设置AccessLevel的值，例如：@Getter(AccessLevel.PROTECTED)
     */
    @Getter(AccessLevel.PUBLIC) @Setter private String name;
    @NonNull private Integer age;
    private final Date birthday;
    private Person mother;
    private Person father;
    private String hobby;
    private String habit;
    private boolean gender;

//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
}

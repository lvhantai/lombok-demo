# lombok简介

lombok的官方地址：https://projectlombok.org/

lombok的Github地址：https://github.com/rzwitserloot/lombok

lombok是一个可以通过简单的注解的形式来帮助我们简化消除一些必须有但显得很臃肿的 Java 代码的工具，简单来说，比如我们新建了一个类，

然后在其中写了几个字段，然后通常情况下我们需要手动去建立getter和setter方法啊，构造函数啊之类的，lombok的作用就是为了省去我们手动

创建这些代码的麻烦，它能够在我们编译源码的时候自动帮我们生成这些方法。lombok能够达到的效果就是在源码中不需要写一些通用的方法，

但是在编译生成的字节码文件中会帮我们生成这些方法，这就是lombok的神奇作用。虽然有人可能会说IDE里面都自带自动生成这些方法的功能，

但是使用lombok会使你的代码看起来更加简洁，写起来也更加方便。

#lombok常用注解介绍

@NonNull ： 使用@NonNull注解修饰的字段通过set方法设置时如果为null, 将抛出NullPointerException

@Cleanup ： 主要用来修饰IO流相关类, 会在finally代码块中对该资源进行close();

@Getter,@Setter ： 为字段生成getter,setter方法, 标记到类上表明为所有字段生成

@ToString ： 生成toString方法, 默认打印所有非静态字段

@EqualsAndHashCode ： 生成equals和hashCode方法

@NoArgsConstructor ： 无参构造函数

@RequiredArgsConstructor ： 为未初始化的final字段和使用@NonNull标注的字段生成构造函数

@AllArgsConstructor ： 为所有字段生成构造函数

@Data ： 相当于同时使@Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor

@Value ： 类将使用 final 进行修饰,同时使用@ToString, @EqualsAndHashCode, @AllArgsConstructor,@Getter

@Builder ： 创建一个静态内部类, 使用该类可以使用链式调用创建对象
如 User 对象中存在 name,age 字段, User user=User.builder().name(“姓名”).age(20).build()

@SneakyThrows ： 对标注的方法进行 try catch 后抛出异常, 可在 value 输入需要 catch 的异常数组, 默认 catch Throwable

@Synchronized ： 在标注的方法内 使用 synchronized(\$lock) {} 对代码进行包裹 ,$lock 为 new Object[0]

@Log,@CommonsLog,@JBossLog,@Log,@Log4j,@Log4j2,@Slf4j,@XSlf4j ： 生成一个当前类的日志对象, 可以使用 topic 指定要获取的日志名称,使用log…使用

#自定义配置
#注 : 在IDEA中,lombok.config文件要放置于src\main\java目录下, 在src\main\resources中将不生效
 虽然lombok能为我们快速生成代码, 但是有一些生成的代码依然无法满足我们的需求. 此时可配置lombok.config来解决问题
 以下列出一些常用的配置:
 
 lombok.getter.noIsPrefix=true #(默认: false)  #lombok 默认对 boolean 类型字段生成的 get 方法使用 is 前缀, 通过此配置则使用 get 前缀
 
 lombok.accessors.chain=true #(默认: false) #默认的 set 方法返回 void 设置为 true 返回调用对象本身
 
 lombok.accessors.fluent=true #(默认: false) #如果设置为 true. get,set 方法将不带 get,set 前缀, 直接以字段名为方法名
 
 lombok.log.fieldName=logger #(默认: log) #设置 log 类注解返回的字段名称
 
 #lombok优缺点
 
 优点：省事，少些写很多模板代码；减少修改属性带来的错误。
 
 缺点: 可读性差；不支持多种参数构造器的重载。
 

# introduction
## Pom文件
### dependency标签
#### scope标签
```xml
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>4.0.1</version>
    <scope>provided</scope>
</dependency>
```
- 在 Pom4 中，dependency 元素中引入了 scope 元素，这是一个很重要的属性。
- 在Maven项目中 <u>*Jar 包冲突、类型转换异常*</u>的很大原因是由于 scope 元素使用不当造成的。 
- scope 元素的作用：**控制 dependency 元素的使用范围**。通俗的讲，就是控制 Jar 包在哪些范围被加载和使用。
- scope 包含五个值，具体含义如下：
    - <u>compile（编译）</u>
      - compile 是默认值，如果没有指定 scope 值，该元素的默认值为 compile。
      - 被依赖项目需要参与到当前项目的编译，测试，打包，运行等阶段。打包的时候通常会包含被依赖项目。
    - <u>provided（已提供的）</u>
      - 被依赖项目理论上可以参与编译、测试、运行等阶段，相当于compile，但是在打包阶段做了exclude的动作。
      - 适用场景：例如， 如果我们在开发一个web 应用，在编译时我们需要依赖 servlet-api.jar，但是在运行时我们不需要该 jar 包，因为这个 jar 包已由应用服务器提供，此时我们需要使用 provided 进行范围修饰。
    - <u>runtime（运行时）</u>
      - 表示被依赖项目无需参与项目的编译，但是会参与到项目的测试和运行。与compile相比，被依赖项目无需参与项目的编译。
      - 适用场景：例如，在编译的时候我们不需要 JDBC API 的 jar 包，而在运行的时候我们才需要 JDBC 驱动包。
    - <u>test（测试）</u>
        - 表示被依赖项目仅仅参与测试相关的工作，包括测试代码的编译，执行。
        - 适用场景：例如，Junit 测试。
    - <u>system（系统）</u>
        - system 元素与 provided 元素类似，但是被依赖项不会从 maven 仓库中查找，d而是从本地系统中获取，systemPath 元素用于制定本地系统中 jar 文件的路径。也就是说，在编译时使用 systemPath 元素指定的 jar 包，在运行时由应用服务器提供 jar 包。
        - 适用场景：项目中存在自定义的基础组件服务时使用。
### package标签
- Java中两种项目打包的格式
    - **jar包**
      - `<package>jar</package>`
      - 将项目看成一整个拼图，引入的 jar包 就是一个拼块，在依赖中经常使用，向项目中添加某些依赖就是下载相应的 jar 包添加到项目中。
    - **war包**
      - `<package>war</package>`
      - 在 javaweb中通常都是将项目打包成war包再进行部署。
    - <u>*区别*</u>：jar包中只是用java来写的项目打包来的，里面只有编译后的class和一些部署文件；而war包里面的东西就全了，包括写的代码编译成的class文件，依赖的包，配置文件，所有的网站页面，包括html，jsp等等。一个war包可以理解为一个web项目，里面有项目的所有东西。

## IOC
### 读取配置文件
#### `ApplicationContext`和`BeanFactory`
- [官方介绍](https://docs.spring.io/spring-framework/docs/5.2.19.BUILD-SNAPSHOT/spring-framework-reference/core.html#beans-introduction)
>The org.springframework.beans and org.springframework.context packages are the basis for Spring Framework’s IoC container. The BeanFactory interface provides an advanced configuration mechanism capable of managing any type of object. ApplicationContext is a sub-interface of BeanFactory. It adds:
> - Easier integration with Spring’s AOP features
> - Message resource handling (for use in internationalization)
> - Event publication
> - Application-layer specific contexts such as the WebApplicationContext for use in web applications.
- 开发人员建议使用`ApplicationContext`
#### 自定义注解
```java
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Color {
}
```
##### `@Documented`
- `@Documented`注解标记的元素，Javadoc工具会将此注解标记元素的注解信息包含在javadoc中。
- 默认，注解信息不会包含在Javadoc中
##### `@Retention`
- 定义被它所注解的注解保留多久
- 有三种策略，定义在RetentionPolicy枚举中
    - source：注解只保留在源文件，当Java文件编译成class文件的时候，注解被遗弃；被编译器忽略；<u>生命周期对应于Java源文件(.java文件)</u>。 
    - class：注解被保留到class文件，但jvm加载class文件时候被遗弃，这是默认的生命周期；<u>生命周期对应于.class文件</u>。      
    - runtime：注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在；生命周期对应于<u>内存中的字节码</u>。
##### `@Target`
- 标识注解的作用目标
- 分类
    - @Target(ElementType.TYPE)——接口、类、枚举、注解
    - @Target(ElementType.FIELD)——字段、枚举的常量
    - @Target(ElementType.METHOD)——方法
    - @Target(ElementType.PARAMETER)——方法参数
    - @Target(ElementType.CONSTRUCTOR) ——构造函数
    - @Target(ElementType.LOCAL_VARIABLE)——局部变量
    - @Target(ElementType.ANNOTATION_TYPE)——注解
    - @Target(ElementType.PACKAGE)——包
### `ObjectProvider`
- 当指定的Bean找不到时，先返回`ObjectProvider`确保不报错，然后使用`getIfAvailable()`进行处理
- 当需要立即使用刚取出的Bean时，调用`ifAvailable()`
```java
public class LazyLookupApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazylookup.xml");
        Cat cat = (Cat) context.getBean("cat");
        System.out.println(cat);

        //获取一个Dog的Provider包装类，使用前不报错
        ObjectProvider<Dog> dogProvider = context.getBeanProvider(Dog.class);

        //getIfAvailable()：当找不到Dog时，返回null，不报错
        Dog dog = dogProvider.getIfAvailable();
        if(dog==null){
            dog = new Dog();
        }
        //简化
//        Dog dog = dogProvider.getIfAvailable(() -> new Dog());
//        Dog dog = dogProvider.getIfAvailable(Dog::new);

        //ifAvailable()：及时使用
        dogProvider.ifAvailable(dog1->{
            System.out.println(dog1);
        });

    }
}
```
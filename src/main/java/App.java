import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Cat;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());

        Cat beanThree =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanThree.getMessage());
        Cat beanFour =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanFour.getMessage());

        System.out.println(bean==beanTwo);
        System.out.println(beanThree==beanFour);
    }
}
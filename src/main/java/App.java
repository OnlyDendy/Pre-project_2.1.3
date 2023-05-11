import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        System.out.println("Переменные HelloWorld ссылаются на один и тот же объект? " + (bean == bean1));

        Cat catbean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catbean.getMessage());
        Cat catbean1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catbean1.getMessage());

        System.out.println("Переменные Cat ссылаются на один и тот же объект? " + (catbean == catbean1));

    }
}
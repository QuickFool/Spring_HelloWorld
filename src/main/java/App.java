import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());

        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1.getMessage());

        boolean comparisonHW = bean == bean1;
        System.out.println(comparisonHW);
        boolean comparisonCat = beanCat == beanCat1;
        System.out.println(comparisonCat);

    }
}
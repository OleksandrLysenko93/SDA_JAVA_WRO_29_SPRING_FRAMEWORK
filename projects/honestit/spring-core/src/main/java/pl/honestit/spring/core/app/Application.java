package pl.honestit.spring.core.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import pl.honestit.spring.core.config.WarmUpConfiguration;
import pl.honestit.spring.core.warmup.HelloWorld;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WarmUpConfiguration.class);

        HelloWorld helloBean = context.getBean("helloBean", HelloWorld.class);
        helloBean.sayHello();

        HelloWorld helloBuzz = context.getBean("buzzBuzz", HelloWorld.class);
        helloBuzz.sayHello();

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.sayHello();

        HelloWorld helloWorld2 = context.getBean("helloWorld", HelloWorld.class);
        helloWorld2.sayHello();
//
//        System.out.println(helloBean==helloBuzz);
//        System.out.println(helloBean==helloWorld);
//        System.out.println(helloBuzz==helloWorld);
//        System.out.println(helloWorld==helloWorld2);
    }

    public static void classPathXmlContext() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloBean = context.getBean(HelloWorld.class);
        helloBean.sayHello();
    }

    public static void genericContext() {
        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean("helloWorld", HelloWorld.class);
        context.refresh();

        HelloWorld bean = (HelloWorld) context.getBean("helloWorld");
        bean.sayHello();

        bean = context.getBean("helloWorld", HelloWorld.class);
        bean.sayHello();

        bean = context.getBean(HelloWorld.class);
        bean.sayHello();


    }
}

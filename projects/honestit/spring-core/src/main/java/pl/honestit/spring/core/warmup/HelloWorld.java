package pl.honestit.spring.core.warmup;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    public void sayHello() {
        System.out.println("Hello world!");
    }
}

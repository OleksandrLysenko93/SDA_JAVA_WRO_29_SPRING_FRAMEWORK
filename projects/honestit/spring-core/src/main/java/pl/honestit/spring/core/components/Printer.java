package pl.honestit.spring.core.components;

import org.springframework.stereotype.Component;

@Component
public interface Printer {

    void print(String message);
}

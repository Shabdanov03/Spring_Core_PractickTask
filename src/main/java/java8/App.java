package java8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Shabdanov Ilim
 **/
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);

        MessagePrinter messagePrinter =
                applicationContext.getBean("messagePrinter", MessagePrinter.class);

        messagePrinter.getMessage();
    }
}

package java8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Shabdanov Ilim
 **/
@Component
public class MessagePrinter {
    private Service service;
    @Value("${MessagePrinter.name}")
    private String name;

    public MessagePrinter(Service service, String name) {
        this.service = service;
        this.name = name;
    }
    public MessagePrinter(){

    }


    @Autowired
    public MessagePrinter( Service service) {
        this.service = service;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getMessage() {
        System.out.println("Service name : "+getName());
        service.getMessage();
    }

    @Override
    public String toString() {
        return "\nMessagePrinter{" +
                "\nservice=" + service +
                "\nname='" + name +
                "\n==================\n";
    }
}

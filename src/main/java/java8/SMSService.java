package java8;

import org.springframework.stereotype.Component;

/**
 * Shabdanov Ilim
 **/
@Component("smsService")
public class SMSService implements Service {
    @Override
    public void getMessage() {
        System.out.println("Hello java-8 from SMSService");
    }
}

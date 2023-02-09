package java8;

import org.springframework.context.annotation.*;

/**
 * Shabdanov Ilim
 **/
@Configuration
@ComponentScan("java8")
@PropertySource("classpath:application.properties")
public class Config {


    @Bean
    public Service emailService(){
        return new EmailService();
    }
    @Primary
    @Bean
    public Service smsService(){
        return new SMSService();
    }
}

package a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(DemoApplication.class,args);
        System.out.println("666");
    }
}

package cp.java.sprinbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cp.java.sprinbootstarter.hello,cp.java.springbootstarter.topic")
public class SpringBootStartApi {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStartApi.class, args);
	}

}

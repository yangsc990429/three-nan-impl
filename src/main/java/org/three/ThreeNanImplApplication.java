package org.three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations="dubbo-consumer.xml")
public class ThreeNanImplApplication {
	public static void main(String[] args) {
		SpringApplication.run(ThreeNanImplApplication.class, args);
	}
}

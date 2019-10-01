package foxety.proton.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
public class ProtonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProtonApplication.class, args);
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySources() {
		return (new PropertySourcesPlaceholderConfigurer());
	}

}

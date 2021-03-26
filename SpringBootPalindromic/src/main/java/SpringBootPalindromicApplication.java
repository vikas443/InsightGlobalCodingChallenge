

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.test.palindromic"})
@EntityScan("com.test.palindromic")
@EnableJpaRepositories("com.test.palindromic")
public class SpringBootPalindromicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPalindromicApplication.class, args);
	}

}

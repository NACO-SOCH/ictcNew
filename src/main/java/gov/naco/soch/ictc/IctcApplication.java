package gov.naco.soch.ictc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaRepositories("gov.naco.soch.repository")
@EnableAsync
@EntityScan("gov.naco.soch.entity")
@ComponentScan(basePackages = { "gov.naco.soch" })
@EnableAutoConfiguration
@EnableScheduling
@EnableCaching
@Configuration
public class IctcApplication {

	public static void main(String[] args) {
		SpringApplication.run(IctcApplication.class, args);
	}

}

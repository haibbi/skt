package io.github.haibbi.bar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BarApplication {
	public static void main(String[] args) {
		SpringApplication.run(BarApplication.class, args);
	}

	@RestController
	static class Resource {
		private final String application;
		private final String hostname;

		public Resource(
			@Value("${spring.application.name}") String application,
			@Value("${HOSTNAME}") String hostname
		) {
			this.application = application;
			this.hostname = hostname;
		}

		@GetMapping
		public String name() {
			return "Hello! I'm " + application + ". Running on " + hostname;
		}
	}
}

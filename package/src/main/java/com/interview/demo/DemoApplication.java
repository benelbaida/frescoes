package com.interview.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * The type Demo application.
 */
@SpringBootApplication
public class DemoApplication {

	private static final Class<DemoApplication> appClass = DemoApplication.class;

	/**
	 * Main.
	 *
	 * @param args the args
	 */
	public static void main(final String[] args) {
		SpringApplication.run(appClass, args);
	}

}

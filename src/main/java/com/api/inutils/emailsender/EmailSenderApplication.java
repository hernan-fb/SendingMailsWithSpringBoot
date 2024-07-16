package com.api.inutils.emailsender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Import(EmailConfig.class)
public class EmailSenderApplication {

	public static void main(String[] args) {
		/*Map<String, String> env = System.getenv();
		env.forEach((key, value) -> {
			System.out.println(key + ": " + value);
		});
		*/
		SpringApplication.run(EmailSenderApplication.class, args);
	}

}

package in.sameer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sameer.service.LoggerService;
import in.sameer.service.ReportService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		LoggerService bean = context.getBean(LoggerService.class);
		bean.UserService();
		
		ReportService bean2 = context.getBean(ReportService.class);
		bean2.ReportService();
		
		
		
	}

}

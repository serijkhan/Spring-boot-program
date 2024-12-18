package in.sameer.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sameer.AppConfig;
import in.sameer.beans.ReportService;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ReportService service = context.getBean(ReportService.class);
		
		service.generateReport();
	}

}
